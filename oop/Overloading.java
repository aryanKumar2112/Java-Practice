package oop;
import java.util.*;
class Overloading {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int p[]=new int[n];
        for (int i = 0; i < n; i++) {
            p[i]= sc.nextInt();

        }
        System.out.println(Arrays.toString(p));
    }

}
