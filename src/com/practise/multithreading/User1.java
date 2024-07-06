package com.practise.multithreading;

public class User1 extends Thread{
    String name;
    Hotstar h1;
    User1(String name,Hotstar h1){
        this.name=name;
        this.h1=h1;
    }
    public void run(){
        h1.play();
        h1.pause();
        h1.changeVideo();
    }
}
