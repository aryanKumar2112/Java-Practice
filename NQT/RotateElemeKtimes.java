package NQT;

import java.sql.SQLOutput;

public class RotateElemeKtimes {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int k=2;

//        for(int i=0;i<k;i++){
//            int temp=arr[0];
//            for (int j = 0; j < arr.length-1; j++) {
//                arr[j]=arr[j+1];
//            }
//            arr[arr.length-1]=temp;
//        }

        //O(n) times
        reverse(arr,0,k-1);
        reverse(arr,k,arr.length-1);
        reverse(arr,0,arr.length-1);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

    }
    public static void reverse(int arr[],int start, int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}
