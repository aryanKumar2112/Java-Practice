package College_work;

import java.util.Scanner;

public class Pallindrome {
    public static void pNum(int x){
        int rem;
        int rev=0;
        int y;
         y=x;
        while(y!=0){

            rem=y%10;
            rev=rev*10+rem;
            y=y/10;
        }
        if(x==rev){
            System.out.println("Enterd number "+x+" is a pallindromic");
        }
        else
            System.out.println(x+" is not a pallindromic number");
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        pNum(n);
    }
}
