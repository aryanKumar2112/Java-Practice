package Java1.Recursion;

import java.util.Scanner;

public class PrintNatural {
    public static void print(int num){
        if (num == 0) {
            System.out.println("done");
            return;
        }
        System.out.println(num);
        num=num-1;
        print(num);
    }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int num=sc.nextInt();
       print(num);
    }
}
