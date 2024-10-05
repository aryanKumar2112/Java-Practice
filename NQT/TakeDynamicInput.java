package NQT;

import java.util.ArrayList;
import java.util.Scanner;

public class TakeDynamicInput {
    public static void main(String args[]){
        ArrayList<Integer>list=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
           String n=sc.next();
           double m=sc.nextDouble();
           int k=sc.nextInt();
            System.out.println(n+" "+m+" "+k);
        }
        System.out.println(list);
    }
    
}
