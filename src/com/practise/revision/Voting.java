package com.practise.revision;

public class Voting {
    int age;
    public void checkVotingEligibility(int age) throws VotingException{
        if(age>18){
            System.out.println("you are eligible to vote");
        }else
//            throw new VotingException("abe bda hoja ");
        throw new VotingException();
    }

    public static void main(String[] args) {
        Voting v=new Voting();

        try {
            v.checkVotingEligibility(15);
        } catch (VotingException e) {
            System.out.println(e.getMessage());
        }
    }
}
