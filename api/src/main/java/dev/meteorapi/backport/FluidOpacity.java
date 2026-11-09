/* Uses Meteor Client source. Copyright (c) Meteor Development. GPL-3.0-only. */
package dev.meteorapi.backport;
/** Portable 26.3 fluid selection policy; does not rewrite Meteor Client's Xray class. */
public enum FluidOpacity { None, Water, Lava, Both;
    public boolean water() { return this == Water || this == Both; }
    public boolean lava() { return this == Lava || this == Both; }
}
