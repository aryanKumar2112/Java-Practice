package College_work;

import java.util.Scanner;

public class ReverseNum {

    public static void revANum(int x){
        int rev=0;
        int rem;
        while(x!=0){
             rem=x%10;
             rev=rev*10+rem;
            x=x/10;

        }
        System.out.println(rev);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        revANum(num);

    }
}
