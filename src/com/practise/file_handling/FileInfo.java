package com.practise.file_handling;

import java.io.File;

public class FileInfo {
    public static void main(String[] args) {
        File f1=new File("D:\\demo1.txt");
        if(f1.exists()){
            System.out.println(f1.canRead());
            System.out.println(f1.canWrite());
            System.out.println(f1.getAbsolutePath());
            System.out.println(f1.length());
            System.out.println(f1.delete());
        }else {
            System.out.println("not found");
        }
    }
}
