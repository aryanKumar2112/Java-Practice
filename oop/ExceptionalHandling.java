package oop;

public class ExceptionalHandling {
    public static void main(String[] args) {
        try {
           System.out.println(1/0);
        }
        catch (ArithmeticException e){
           // System.out.println(e);
        }
        System.out.println("hello world");
        System.out.println("hello world");
    }
}
//program k normal flow ko todna- exception
//it occurs on run time
//exception,error
//checked-compile time,unchecked-run time

