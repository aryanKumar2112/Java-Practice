package Array___;

import java.util.Scanner;

public class Var {


        static void var(int ...arr){
        int sum=0;
        for(int elem:arr){
            sum+=elem;
        }
        System.out.println(sum);
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[6];
        for(int i=1;i<=6;i++){
            for (int j = 0; j < args.length; j++) {
                arr[i]=sc.nextInt();
                var(j);
            }

        }

        }


    }

