package com.practise.objectclass;

public class College {
    int eNo;
    String sName;
    public College(int eNo,String sName){
        this.eNo=eNo;
        this.sName=sName;
    }
    @Override
    public String toString(){
        return "Enrollment no is"+"  "+eNo+" "+"Name of student is"+" "+sName;
    }

    public static void main(String[] args) {
        College s1=new College(111,"john wick");
        College s2=new College(199,"alexender");
        College s3=new College(211,"twrt");
        College c[]={s1,s2,s3};
        for (int i=0;i<c.length;i++){
            System.out.println(c[i]);
        }


    }
}
