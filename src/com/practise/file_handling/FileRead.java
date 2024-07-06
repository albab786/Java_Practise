package com.practise.file_handling;

import java.io.FileReader;
import java.io.IOException;

public class FileRead {
    public static void main(String[] args) {
        try{


            FileReader f=new FileReader("D:\\demo.txt");

            try{
                int i;
                while ((i = f.read()) != -1){
                    System.out.print((char)i);
                }
            }
            finally {
                f.close();
            }
        }
        catch (IOException e){
            System.out.println(e);
        }
    }
}
