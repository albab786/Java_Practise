package com.practise.file_handling;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) throws IOException {
        File f=new File("D:\\abc.pdf");
        f.createNewFile();
        System.out.println("file created");
    }
}
