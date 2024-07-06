package com.practise.file_handling;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) {
        try {
            FileWriter f = new FileWriter("D:\\demo.txt");
            try {
                f.write("java programming");
            }finally {
                f.close();
            }
        }catch (IOException e){
            System.out.println(e);
        }
    }
}
