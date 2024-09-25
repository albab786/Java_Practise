package com.practise.filehandling;

import java.io.File;
import java.io.IOException;

public class Demo {
    public static void main(String[] args) {
        File f=new File("D:/abc.txt");
        try {
            f.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
