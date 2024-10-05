package Array___;

import java.util.Scanner;

public class PrintSumAvg {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the val of n");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < arr.length;  i++) {
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
           sum=sum+arr[i];
        }
        System.out.println("sum="+sum);
        float avg=sum/n;
        System.out.println("Average = "+avg);

    }
}
