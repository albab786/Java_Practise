package com.practise.dynamic_method_dispatch;

public class IPL {
    public void play(){
        System.out.println("IPl started");
    }

}
 class KKR extends IPL{

    public void play(){
        System.out.println("KKR started playing");
    }

}
class CSK extends IPL{
    public void play(){
        System.out.println("CSK started playing");
    }

}


