package org.example.exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ThrowsDemo {
    static void readFile() throws IOException {
        FileReader file =new FileReader("bogambo.txt"); //note that bogambo.txt doesn't exist.
        BufferedReader bf = new BufferedReader(file);
        System.out.println(bf.readLine());
        bf.close();
    }
    static void processFile() throws IOException{
        readFile();
    }
    public static void main(String[] args)
    {
        try{
            processFile();
        }catch (IOException e){
            System.out.println("IOException handled in main()");
            System.out.println("Reason: "+e.getMessage());
        }
        System.out.println("continue normally");
    }
}
