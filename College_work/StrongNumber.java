package College_work;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int key=n;
        int sum=0;
        while(n>0){
            int rem=n%10;
            int fact=1;
            for (int i = 1; i <=rem ; i++) {
                fact*=i;
            }
            sum+=fact;
            n=n/10;
        }
        if(sum==key){
            System.out.println("enterd number is amstrong");
        }
        else{
            System.out.println("not amstrong number");
        }

    }
}
