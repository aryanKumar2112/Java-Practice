package DSA.Function;

import java.util.Scanner;

public class ParaAndNoRetuenType {
    public static void calcSum(int num1,int num2){
        int sum=num1+num2;
        System.out.println("Sum is "+sum);
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        calcSum(a,b);
    }

}