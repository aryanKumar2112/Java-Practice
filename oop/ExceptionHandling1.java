package oop;

public class ExceptionHandling1 {
    public static void main(String[] args) {
        try{
            int a=Integer.parseInt("djkfh");

        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println("hello world");
    }
}
