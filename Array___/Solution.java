package Array___;

import java.util.Scanner;

public class Solution {
    public void rotate(int arr[], int n)

    {
        int temp=arr[arr.length-1];
        for(int i=0;i<arr.length-1;i++){
            arr[i+1]=arr[i];

        }
        arr[0]=temp;
        for(int i=0;i< arr.length;i++){
            System.out.println(arr[i]+" ");
        }




    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int prr[]=new int[n];
        for(int i=0;i<prr.length;i++){
            prr[i]=sc.nextInt();
        }
        Solution obj=new Solution();
        obj.rotate(prr,n);

    }



    }

