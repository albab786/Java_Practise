package com.practise.multithreading;

public class User2 extends Thread{
    String name;
    Hotstar h1;
    User2(String name,Hotstar h1){
        this.name=name;
        this.h1=h1;
    }
    public void run(){
        h1.play();
        h1.pause();
        h1.changeVideo();
    }
}
