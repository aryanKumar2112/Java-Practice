package Java1;

import java.util.Scanner;

public class PrintNumber2 {
    public static void printNum(int n){
       if(n==0){
           return;
       }

       n=n-1;
       printNum(n);
        System.out.println(n);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        printNum(n);
    }
}
