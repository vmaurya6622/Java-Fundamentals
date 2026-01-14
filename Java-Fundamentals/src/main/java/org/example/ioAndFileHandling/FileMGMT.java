package org.example.io;
/*
    File handling in java helps us to Create files, Read, Write data to the files and open/close files safely.
    File handling is supported by java.io.package
    -> Types:
          - Byte Streams: Raw Binary data; use InputStream and OutputStream classes and their subclasses.
                          byte streams are best for non text data like: Images, audio and videos.
          - Character Streams: Raw Character data; uses reader and writer classes along with their subclasses.

    -> Important Classes
          - File (Represents file or directory)
          - FileReader (Reads Character Data)
          - FileWriter (Writes Character Data)
          - BufferedReader (for efficient reading)
          - BufferedWriter (for efficient Writing)

     -> Important points to be noted:
          - Always close the files you opened.
          - use buffering for better performance.
          - prefer try-catch-finally blocks for fileMGMT as corrupted files may disrupt the program.
 */
public class FileMGMT {

}
