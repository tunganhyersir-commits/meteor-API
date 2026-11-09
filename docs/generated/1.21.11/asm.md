# asm

Khai báo Java có cú pháp public/protected. Không bao gồm API kế thừa/tổng hợp bởi compiler; xem kiểm tra bytecode riêng.

## meteordevelopment.meteorclient.asm.Asm

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/asm/Asm.java:30`

```java
public class Asm
```

## meteordevelopment.meteorclient.asm.Asm.INSTANCE

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/asm/Asm.java:31`

```java
public static Asm INSTANCE
```

## meteordevelopment.meteorclient.asm.Asm.Asm

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/asm/Asm.java:36`

```java
public Asm(boolean export)
```

## meteordevelopment.meteorclient.asm.Asm.init

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/asm/Asm.java:40`

```java
public static void init()
```

## meteordevelopment.meteorclient.asm.Asm.transform

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/asm/Asm.java:51`

```java
public byte[] transform(String name, byte[] bytes)
```

## meteordevelopment.meteorclient.asm.Asm.Transformer

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/asm/Asm.java:83`

```java
public static class Transformer implements IMixinTransformer
```

## meteordevelopment.meteorclient.asm.Asm.Transformer.delegate

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/asm/Asm.java:84`

```java
public IMixinTransformer delegate
```

## meteordevelopment.meteorclient.asm.Asm.Transformer.audit

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/asm/Asm.java:86`

```java
@Override public void audit(MixinEnvironment environment)
```

## meteordevelopment.meteorclient.asm.Asm.Transformer.reload

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/asm/Asm.java:91`

```java
@Override public List<String> reload(String mixinClass, ClassNode classNode)
```

## meteordevelopment.meteorclient.asm.Asm.Transformer.computeFramesForClass

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/asm/Asm.java:96`

```java
@Override public boolean computeFramesForClass(MixinEnvironment environment, String name, ClassNode classNode)
```

## meteordevelopment.meteorclient.asm.Asm.Transformer.transformClassBytes

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/asm/Asm.java:101`

```java
@Override public byte[] transformClassBytes(String name, String transformedName, byte[] basicClass)
```

## meteordevelopment.meteorclient.asm.Asm.Transformer.transformClass

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/asm/Asm.java:107`

```java
@Override public byte[] transformClass(MixinEnvironment environment, String name, byte[] classBytes)
```

## meteordevelopment.meteorclient.asm.Asm.Transformer.transformClass

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/asm/Asm.java:112`

```java
@Override public boolean transformClass(MixinEnvironment environment, String name, ClassNode classNode)
```

## meteordevelopment.meteorclient.asm.Asm.Transformer.couldTransformClass

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/asm/Asm.java:117`

```java
@Override public boolean couldTransformClass(MixinEnvironment environment, String name)
```

## meteordevelopment.meteorclient.asm.Asm.Transformer.generateClass

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/asm/Asm.java:122`

```java
@Override public byte[] generateClass(MixinEnvironment environment, String name)
```

## meteordevelopment.meteorclient.asm.Asm.Transformer.generateClass

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/asm/Asm.java:127`

```java
@Override public boolean generateClass(MixinEnvironment environment, String name, ClassNode classNode)
```

## meteordevelopment.meteorclient.asm.Asm.Transformer.getExtensions

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/asm/Asm.java:132`

```java
@Override public IExtensionRegistry getExtensions()
```

## meteordevelopment.meteorclient.asm.AsmTransformer

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/asm/AsmTransformer.java:12`

```java
public abstract class AsmTransformer
```

## meteordevelopment.meteorclient.asm.AsmTransformer.targetName

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/asm/AsmTransformer.java:13`

```java
public final String targetName
```

## meteordevelopment.meteorclient.asm.AsmTransformer.AsmTransformer

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/asm/AsmTransformer.java:15`

```java
protected AsmTransformer(String targetName)
```

## meteordevelopment.meteorclient.asm.AsmTransformer.transform

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/asm/AsmTransformer.java:19`

```java
public abstract void transform(ClassNode klass)
```

## meteordevelopment.meteorclient.asm.AsmTransformer.getMethod

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/asm/AsmTransformer.java:21`

```java
protected MethodNode getMethod(ClassNode klass, MethodInfo methodInfo)
```

## meteordevelopment.meteorclient.asm.AsmTransformer.error

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/asm/AsmTransformer.java:29`

```java
protected static void error(String message)
```

## meteordevelopment.meteorclient.asm.AsmTransformer.mapClassName

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/asm/AsmTransformer.java:34`

```java
protected static String mapClassName(String name)
```

## meteordevelopment.meteorclient.asm.Descriptor

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/asm/Descriptor.java:11`

```java
public class Descriptor
```

## meteordevelopment.meteorclient.asm.Descriptor.Descriptor

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/asm/Descriptor.java:14`

```java
public Descriptor(String... components)
```

## meteordevelopment.meteorclient.asm.Descriptor.toString

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/asm/Descriptor.java:18`

```java
public String toString(boolean method, boolean map)
```

## meteordevelopment.meteorclient.asm.FieldInfo

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/asm/FieldInfo.java:12`

```java
public class FieldInfo
```

## meteordevelopment.meteorclient.asm.FieldInfo.FieldInfo

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/asm/FieldInfo.java:15`

```java
public FieldInfo(String owner, String name, Descriptor descriptor, boolean map)
```

## meteordevelopment.meteorclient.asm.FieldInfo.equals

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/asm/FieldInfo.java:31`

```java
public boolean equals(FieldInsnNode insn)
```

## meteordevelopment.meteorclient.asm.MethodInfo

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/asm/MethodInfo.java:13`

```java
public class MethodInfo
```

## meteordevelopment.meteorclient.asm.MethodInfo.MethodInfo

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/asm/MethodInfo.java:16`

```java
public MethodInfo(String owner, String name, Descriptor descriptor, boolean map)
```

## meteordevelopment.meteorclient.asm.MethodInfo.equals

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/asm/MethodInfo.java:32`

```java
public boolean equals(MethodNode method)
```

## meteordevelopment.meteorclient.asm.MethodInfo.equals

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/asm/MethodInfo.java:36`

```java
public boolean equals(MethodInsnNode insn)
```

## meteordevelopment.meteorclient.asm.transformers.PacketInflaterTransformer

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/asm/transformers/PacketInflaterTransformer.java:20`

```java
public class PacketInflaterTransformer extends AsmTransformer
```

## meteordevelopment.meteorclient.asm.transformers.PacketInflaterTransformer.PacketInflaterTransformer

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/asm/transformers/PacketInflaterTransformer.java:23`

```java
public PacketInflaterTransformer()
```

## meteordevelopment.meteorclient.asm.transformers.PacketInflaterTransformer.transform

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/asm/transformers/PacketInflaterTransformer.java:29`

```java
@Override public void transform(ClassNode klass)
```
