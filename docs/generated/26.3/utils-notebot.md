# utils/notebot

Khai báo Java có cú pháp public/protected. Không bao gồm API kế thừa/tổng hợp bởi compiler; xem kiểm tra bytecode riêng.

## meteordevelopment.meteorclient.utils.notebot.NotebotUtils

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/notebot/NotebotUtils.java:19`

```java
public class NotebotUtils
```

## meteordevelopment.meteorclient.utils.notebot.NotebotUtils.getNoteFromNoteBlock

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/notebot/NotebotUtils.java:21`

```java
public static Note getNoteFromNoteBlock(BlockState noteBlock, BlockPos blockPos, NotebotMode mode, InstrumentDetectFunction instrumentDetectFunction)
```

## meteordevelopment.meteorclient.utils.notebot.NotebotUtils.NotebotMode

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/notebot/NotebotUtils.java:31`

```java
public enum NotebotMode
```

## meteordevelopment.meteorclient.utils.notebot.NotebotUtils.OptionalInstrument

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/notebot/NotebotUtils.java:35`

```java
public enum OptionalInstrument
```

## meteordevelopment.meteorclient.utils.notebot.NotebotUtils.OptionalInstrument.BY_MINECRAFT_INSTRUMENT

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/notebot/NotebotUtils.java:53`

```java
public static final Map<NoteBlockInstrument, OptionalInstrument> BY_MINECRAFT_INSTRUMENT = new HashMap<>()
```

## meteordevelopment.meteorclient.utils.notebot.NotebotUtils.OptionalInstrument.toMinecraftInstrument

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/notebot/NotebotUtils.java:67`

```java
public NoteBlockInstrument toMinecraftInstrument()
```

## meteordevelopment.meteorclient.utils.notebot.NotebotUtils.OptionalInstrument.fromMinecraftInstrument

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/notebot/NotebotUtils.java:71`

```java
public static OptionalInstrument fromMinecraftInstrument(NoteBlockInstrument instrument)
```

## meteordevelopment.meteorclient.utils.notebot.decoder.NBSSongDecoder

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/notebot/decoder/NBSSongDecoder.java:23`

```java
public class NBSSongDecoder extends SongDecoder
```

## meteordevelopment.meteorclient.utils.notebot.decoder.NBSSongDecoder.NOTE_OFFSET

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/notebot/decoder/NBSSongDecoder.java:25`

```java
public static final int NOTE_OFFSET = 33
```

## meteordevelopment.meteorclient.utils.notebot.decoder.NBSSongDecoder.parse

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/notebot/decoder/NBSSongDecoder.java:34`

```java
@Override @NonNull public Song parse(File songFile) throws Exception
```

## meteordevelopment.meteorclient.utils.notebot.decoder.SongDecoder

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/notebot/decoder/SongDecoder.java:14`

```java
public abstract class SongDecoder
```

## meteordevelopment.meteorclient.utils.notebot.decoder.SongDecoder.notebot

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/notebot/decoder/SongDecoder.java:15`

```java
protected Notebot notebot = Modules.get().get(Notebot.class)
```

## meteordevelopment.meteorclient.utils.notebot.decoder.SongDecoder.parse

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/notebot/decoder/SongDecoder.java:23`

```java
public abstract Song parse(File file) throws Exception
```

## meteordevelopment.meteorclient.utils.notebot.decoder.SongDecoders

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/notebot/decoder/SongDecoders.java:22`

```java
public class SongDecoders
```

## meteordevelopment.meteorclient.utils.notebot.decoder.SongDecoders.registerDecoder

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/notebot/decoder/SongDecoders.java:31`

```java
public static void registerDecoder(String extension, SongDecoder songDecoder)
```

## meteordevelopment.meteorclient.utils.notebot.decoder.SongDecoders.getDecoder

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/notebot/decoder/SongDecoders.java:35`

```java
public static SongDecoder getDecoder(File file)
```

## meteordevelopment.meteorclient.utils.notebot.decoder.SongDecoders.hasDecoder

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/notebot/decoder/SongDecoders.java:39`

```java
public static boolean hasDecoder(File file)
```

## meteordevelopment.meteorclient.utils.notebot.decoder.SongDecoders.hasDecoder

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/notebot/decoder/SongDecoders.java:43`

```java
public static boolean hasDecoder(Path path)
```

## meteordevelopment.meteorclient.utils.notebot.decoder.SongDecoders.parse

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/notebot/decoder/SongDecoders.java:53`

```java
@NonNull public static Song parse(File file) throws Exception
```

## meteordevelopment.meteorclient.utils.notebot.decoder.TextSongDecoder

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/notebot/decoder/TextSongDecoder.java:19`

```java
public class TextSongDecoder extends SongDecoder
```

## meteordevelopment.meteorclient.utils.notebot.decoder.TextSongDecoder.parse

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/notebot/decoder/TextSongDecoder.java:21`

```java
@Override public Song parse(File file) throws Exception
```

## meteordevelopment.meteorclient.utils.notebot.instrumentdetect.InstrumentDetectFunction

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/notebot/instrumentdetect/InstrumentDetectFunction.java:12`

```java
public interface InstrumentDetectFunction
```

## meteordevelopment.meteorclient.utils.notebot.instrumentdetect.InstrumentDetectFunction.detectInstrument

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/notebot/instrumentdetect/InstrumentDetectFunction.java:20`

```java
NoteBlockInstrument detectInstrument(BlockState noteBlock, BlockPos blockPos)
```

## meteordevelopment.meteorclient.utils.notebot.instrumentdetect.InstrumentDetectMode

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/notebot/instrumentdetect/InstrumentDetectMode.java:11`

```java
public enum InstrumentDetectMode
```

## meteordevelopment.meteorclient.utils.notebot.instrumentdetect.InstrumentDetectMode.getInstrumentDetectFunction

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/notebot/instrumentdetect/InstrumentDetectMode.java:21`

```java
public InstrumentDetectFunction getInstrumentDetectFunction()
```

## meteordevelopment.meteorclient.utils.notebot.song.Note

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/notebot/song/Note.java:12`

```java
public class Note
```

## meteordevelopment.meteorclient.utils.notebot.song.Note.Note

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/notebot/song/Note.java:17`

```java
public Note(NoteBlockInstrument instrument, int noteLevel)
```

## meteordevelopment.meteorclient.utils.notebot.song.Note.getInstrument

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/notebot/song/Note.java:22`

```java
public NoteBlockInstrument getInstrument()
```

## meteordevelopment.meteorclient.utils.notebot.song.Note.setInstrument

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/notebot/song/Note.java:26`

```java
public void setInstrument(NoteBlockInstrument instrument)
```

## meteordevelopment.meteorclient.utils.notebot.song.Note.getNoteLevel

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/notebot/song/Note.java:30`

```java
public int getNoteLevel()
```

## meteordevelopment.meteorclient.utils.notebot.song.Note.setNoteLevel

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/notebot/song/Note.java:34`

```java
public void setNoteLevel(int noteLevel)
```

## meteordevelopment.meteorclient.utils.notebot.song.Note.equals

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/notebot/song/Note.java:38`

```java
@Override public boolean equals(Object o)
```

## meteordevelopment.meteorclient.utils.notebot.song.Note.hashCode

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/notebot/song/Note.java:46`

```java
@Override public int hashCode()
```

## meteordevelopment.meteorclient.utils.notebot.song.Note.toString

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/notebot/song/Note.java:51`

```java
@Override public String toString()
```

## meteordevelopment.meteorclient.utils.notebot.song.Song

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/notebot/song/Song.java:14`

```java
public class Song
```

## meteordevelopment.meteorclient.utils.notebot.song.Song.Song

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/notebot/song/Song.java:24`

```java
public Song(Multimap<Integer, Note> notesMap, String title, String author)
```

## meteordevelopment.meteorclient.utils.notebot.song.Song.finishLoading

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/notebot/song/Song.java:31`

```java
public void finishLoading()
```

## meteordevelopment.meteorclient.utils.notebot.song.Song.getNotesMap

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/notebot/song/Song.java:40`

```java
public Multimap<Integer, Note> getNotesMap()
```

## meteordevelopment.meteorclient.utils.notebot.song.Song.getRequirements

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/notebot/song/Song.java:44`

```java
public Set<Note> getRequirements()
```

## meteordevelopment.meteorclient.utils.notebot.song.Song.getLastTick

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/notebot/song/Song.java:49`

```java
public int getLastTick()
```

## meteordevelopment.meteorclient.utils.notebot.song.Song.getTitle

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/notebot/song/Song.java:54`

```java
public String getTitle()
```

## meteordevelopment.meteorclient.utils.notebot.song.Song.getAuthor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/notebot/song/Song.java:58`

```java
public String getAuthor()
```
