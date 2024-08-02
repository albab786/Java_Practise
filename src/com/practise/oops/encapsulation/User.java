package com.practise.oops.encapsulation;

import java.io.Serializable;
//java beans class
public class User implements Serializable {
    private long id;
    private String name;
    private String password;
    User(){

    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public String getPaswprd(){
        return password;
    }
    public void setId(long id){
        this.id=id;
    }
    public void setName(String name){
        this.name=name;
    }

    public String getPassword() {
        return password;
    }
}
