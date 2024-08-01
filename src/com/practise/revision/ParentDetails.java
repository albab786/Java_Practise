package com.practise.revision;

public class ParentDetails {
    String name;
    String address;
    ParentDetails(){

    }
   public ParentDetails(String name, String address){
        this.name=name;
        this.address=address;
    }
    public void dis(){
        System.out.println("=============parent details==================");
    }


}
