package College_work;

import java.util.Scanner;

public class method1 {

    public static void checkPrime(int x){
        int count=0;
        for (int i = 1; i <=x ; i++) {
            if(x%i==0){
                count++;
            }
        }
        System.out.println(count);
        if(count==2){
            System.out.println("Enterd number is prime");
        }
        else {
            System.out.println("Entered number is not prime");
        }
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        checkPrime(n);
    }
}
