package Array___;

import practice.Solution;

import java.util.Arrays;
import java.util.Scanner;

public class MoveNegativeElemAtEnd {
    public void segregateElements(int arr[], int n)
    {
        Arrays.sort(arr);
        int low=0;
        int high=arr.length-1;



        while(low<high){
            int temp=arr[low];
            arr[low]=arr[high];
            arr[high]=temp;

            low++;
            high--;
        }
        for (int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");}


    }
  /*  public static void printArray(int arr[], int n)
    {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }*/
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int prr[]=new int[n];
        for(int i=0;i<prr.length;i++){
            prr[i]=sc.nextInt();
        }
        MoveNegativeElemAtEnd obj=new MoveNegativeElemAtEnd();
        obj.segregateElements(prr,n);
       // obj. printArray(prr,  n);
    }
}
