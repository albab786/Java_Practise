package com.practise.revision;

public class VotingException extends Exception{
    VotingException(){
        super("you are not eligible to vote");
    }
    VotingException(String msg){
        super(msg);
    }
}
