package com.practise.multithreading;

public class Hotstar {
    public void play() {
        System.out.println("Play Started");
        for(int i=1;i<=10;i++)
            System.out.println("User is watching since "+i+"min");
        System.out.println("Play Ends!");
    }
    public void pause(){
        System.out.println("paused=========================");
    }
    public void changeVideo(){
        System.out.println("changed=========================");
    }
}
