package org.example.io;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

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
     -> We use createNewFile() to create a new file and delete() to delete the existing files.
     -> while reading to check that next line exists or not in the while loop we will use Reader.hasNextLine()
        and to read the whole line we use nextLine().

     -> Now, to copy and paste files from one directory to another can be done seamlessly using Files.copy(sourcePath, DestinationPath, Options)
         where Files is a library imported using java.mio.file.Files.

 */
public class FileMGMT {
    static void main() {
        // writing inside the file
        String NameofFile = "C:\\Users\\vimaurya\\OneDrive - Ciena Corporation\\Documents\\GitHub\\Java-Fundamentals\\Java-Fundamentals\\src\\main\\resources\\data.txt";
        System.out.println("Writing to the empty file.");
        try{
            FileWriter fw = new FileWriter(NameofFile);
            fw.write("HII! this must be written inside the file.\nwe will meet you guys!");
            fw.close();
            System.out.println("File written successfully.");
        }catch(IOException e){
            System.out.println("Error while writing to file.");
        }

        // Reading from the file
        System.out.println();
        System.out.println("Reading from the file which was created:");
        try{
            FileReader fr = new FileReader(NameofFile);
            BufferedReader br = new BufferedReader(fr);
            String WhatReadFromFile;
            while((WhatReadFromFile=br.readLine())!=null){
                System.out.println(WhatReadFromFile);
            }
            br.close();
        } catch (IOException e) {
            System.out.println("Error while Reading from the file: "+e.getMessage());
        }

        /* Copy and paste the files from a source path to a destination path
           Note that before running this part of the code there must be a file inside the directory
           SourceFolder.*/

        // Also make sure that destination folder doesn't have a filename exactly the same which can
        // cause issues and errors.
        Path source=Paths.get("Java-Fundamentals/SourceFolder/FileToTransfer.txt");
        Path target=Paths.get("Java-Fundamentals/DestinationFolder/new.txt");
        try{
            Files.copy(source,target);
            System.out.println("File copied successfully.");
        }catch (IOException e){
            System.out.println("Error while copying.");
        }

        System.out.println("\nWaiting for you to verify the copying of the file.. when you finished verifying enter anything to proceed");
        Scanner sc = new Scanner(System.in);
        sc.nextLine();

        // Deleting the file
        // Path target=Paths.get("Java-Fundamentals/DestinationFolder/new.txt");
        // to resolve any error/ conflict you run this code next time i will delete the file @ ("Java-Fundamentals/DestinationFolder/new.txt");
        System.out.println("Deleting (Java-Fundamentals/DestinationFolder/new.txt)");
        File file=new File("Java-Fundamentals/DestinationFolder/new.txt");
        if(file.delete()){
            System.out.println("File deleted successfully.");
        }else{
            System.out.println("Error deleting file.");
        }
    }
}
