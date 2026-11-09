# utils/other

Khai báo Java có cú pháp public/protected. Không bao gồm API kế thừa/tổng hợp bởi compiler; xem kiểm tra bytecode riêng.

## meteordevelopment.meteorclient.utils.other.JsonDateDeserializer

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/other/JsonDateDeserializer.java:17`

```java
public class JsonDateDeserializer implements JsonDeserializer<Date>
```

## meteordevelopment.meteorclient.utils.other.JsonDateDeserializer.deserialize

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/other/JsonDateDeserializer.java:18`

```java
@Override public Date deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException
```

## meteordevelopment.meteorclient.utils.other.Snapper

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/other/Snapper.java:8`

```java
public class Snapper
```

## meteordevelopment.meteorclient.utils.other.Snapper.Snapper

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/other/Snapper.java:19`

```java
public Snapper(Container container)
```

## meteordevelopment.meteorclient.utils.other.Snapper.move

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/other/Snapper.java:23`

```java
public void move(Element element, int deltaX, int deltaY)
```

## meteordevelopment.meteorclient.utils.other.Snapper.unsnap

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/other/Snapper.java:33`

```java
public void unsnap()
```

## meteordevelopment.meteorclient.utils.other.Snapper.Container

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/other/Snapper.java:213`

```java
public interface Container
```

## meteordevelopment.meteorclient.utils.other.Snapper.Container.getElements

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/other/Snapper.java:214`

```java
Iterable<Element> getElements()
```

## meteordevelopment.meteorclient.utils.other.Snapper.Container.shouldNotSnapTo

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/other/Snapper.java:216`

```java
boolean shouldNotSnapTo(Element element)
```

## meteordevelopment.meteorclient.utils.other.Snapper.Container.getSnappingRange

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/other/Snapper.java:218`

```java
int getSnappingRange()
```

## meteordevelopment.meteorclient.utils.other.Snapper.Element

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/other/Snapper.java:221`

```java
public interface Element
```

## meteordevelopment.meteorclient.utils.other.Snapper.Element.getX

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/other/Snapper.java:222`

```java
int getX()
```

## meteordevelopment.meteorclient.utils.other.Snapper.Element.getY

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/other/Snapper.java:223`

```java
int getY()
```

## meteordevelopment.meteorclient.utils.other.Snapper.Element.getX2

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/other/Snapper.java:225`

```java
default int getX2()
```

## meteordevelopment.meteorclient.utils.other.Snapper.Element.getY2

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/other/Snapper.java:226`

```java
default int getY2()
```

## meteordevelopment.meteorclient.utils.other.Snapper.Element.getWidth

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/other/Snapper.java:228`

```java
int getWidth()
```

## meteordevelopment.meteorclient.utils.other.Snapper.Element.getHeight

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/other/Snapper.java:229`

```java
int getHeight()
```

## meteordevelopment.meteorclient.utils.other.Snapper.Element.setPos

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/other/Snapper.java:231`

```java
void setPos(int x, int y)
```

## meteordevelopment.meteorclient.utils.other.Snapper.Element.move

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/other/Snapper.java:232`

```java
void move(int deltaX, int deltaY)
```
