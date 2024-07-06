package com.practise.oops;

public class CopyConstructor {
   int no_of_items;
   int total;
   public CopyConstructor(int no_of_items,int total){
       this.no_of_items=no_of_items;
       this.total=total;
   }
   //copy constructor
    public CopyConstructor(CopyConstructor original){
       this.no_of_items=original.no_of_items;
       this.total=original.total;

    }
    public String toString(){
       return "CopyConstructor{item='" + no_of_items + "', total=" + total + '}';
    }

    public static void main(String[] args) {
        CopyConstructor original=new CopyConstructor(15,44);
        CopyConstructor copy=new CopyConstructor(original);
        System.out.println("original"+ original);
        System.out.println("copy"+ copy);

    }
}
