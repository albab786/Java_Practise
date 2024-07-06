package com.practise.dynamic_method_dispatch;

public class Main {
    public static void main(String[] args) {
        IPL ipl=new IPL();
        ipl.play();
        ipl=new KKR();
        ipl.play();
        ipl=new CSK();
        ipl.play();
    }
}
