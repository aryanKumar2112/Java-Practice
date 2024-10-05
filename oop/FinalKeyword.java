package oop;
/*class A{
    void display(){
       System.out.println("Helo");

    }

}
class B extends A{
     void display(){
        System.out.println("Helo");

    }

}*/

public class FinalKeyword extends B{
    public static void main(String[] args) {
        final int a;
        a=20;
        //a=27 not possible;
        B obj=new B();
    }
}
//class final declared inside all method final does not inherit
//method declared final does not use to override
