package oop;

public class ExceptionTCF {
    public static void main(String[] args) {
        int arr[]=new int[5];
        try{
            System.out.println(arr[5]);
        }
        catch(Exception e){
            System.out.println(e);
           // System.out.println(e.toString());
           // System.out.println(e.getMessage());


        }
        finally {
            System.out.println("mai to jaunga hi");
        }
        System.out.println("hello world");
        System.out.println("hello world");
    }
}
