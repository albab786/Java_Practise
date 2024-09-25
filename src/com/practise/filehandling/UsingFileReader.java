package com.practise.filehandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class UsingFileReader {
    public static void main(String[] args) throws IOException {
        FileWriter fw=null;
        try {
            //FileReader f=new FileReader("D:/filereader.txt");
         fw=new FileWriter("D:\\filereader.txt");
            fw.write("hello dude");
            fw.write(67);

        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            fw.close();
        }
    }
}
