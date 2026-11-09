/* SPDX-License-Identifier: GPL-3.0-only */
package dev.meteorapi.client;

import dev.meteorapi.MeteorApi;
import dev.meteorlib.foundation.RegistrationResult;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * Multiple independently named clients can coexist; there is no global "current client" override.
 */
public final class Clients {
  private static final Map<String, Client> CLIENTS = new LinkedHashMap<>();

  private Clients() {}

  public static RegistrationResult<Client> create(String owner, String title) {
    MeteorApi.requireClientThread();
    if (title == null || title.isBlank())
      return new RegistrationResult<>(
          RegistrationResult.Status.INVALID, Optional.empty(), "Client title cannot be blank");
    try {
      dev.meteorlib.foundation.NameRules.scoped(owner, "validate");
    } catch (IllegalArgumentException invalid) {
      return new RegistrationResult<>(
          RegistrationResult.Status.INVALID, Optional.empty(), invalid.getMessage());
    }
    if (CLIENTS.containsKey(owner))
      return new RegistrationResult<>(
          RegistrationResult.Status.CONFLICT,
          Optional.empty(),
          "Client owner already exists: " + owner);
    Client client = new Client(owner, title);
    CLIENTS.put(owner, client);
    return new RegistrationResult<>(
        RegistrationResult.Status.REGISTERED, Optional.of(client), "registered");
  }

  public static List<Client> all() {
    MeteorApi.requireClientThread();
    return List.copyOf(CLIENTS.values());
  }

  static void remove(Client client) {
    CLIENTS.remove(client.owner(), client);
  }

  public static boolean dispatchChat(String message) {
    MeteorApi.requireClientThread();
    if (!message.startsWith("@")) return false;
    int split = message.indexOf(' ');
    String owner = message.substring(1, split < 0 ? message.length() : split);
    Client client = CLIENTS.get(owner);
    if (client == null || !client.started()) return false;
    client.execute(split < 0 ? "help" : message.substring(split + 1));
    return true;
  }
}
