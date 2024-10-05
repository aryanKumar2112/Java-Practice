package College_work;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the range");
        int n=sc.nextInt();
        for (int i = 1; i <=n ; i++) {
            int a=0;
            a=sc.nextInt();
            sum+=a;


        }
        System.out.println("sum of number is "+sum);
    }
};

