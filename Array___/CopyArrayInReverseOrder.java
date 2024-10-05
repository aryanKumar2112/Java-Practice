package Array___;

import java.util.Arrays;
import java.util.Scanner;

public class CopyArrayInReverseOrder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size=sc.nextInt();
        int arr[]=new int[size];

        for (int i = 0; i <arr.length ; i++) {
            arr[i]=sc.nextInt();
        }
        int rev[]=new int[size];
        //2 pointers algorithm

        for (int i = arr.length-1, j=0; i>=0 ; i--,j++) {
            rev[j]=arr[i];

        }
        System.out.println(Arrays.toString(rev));


    }
}
