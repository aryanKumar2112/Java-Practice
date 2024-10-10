package Java1;

import java.util.Scanner;

public class Factorial {
    public static int calcFact(int n){
       if(n==0){
           return 1;
       }
       int fact=n*calcFact(n-1);

       return fact;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

    }
}
