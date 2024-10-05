package NQT;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[]={1,4,3,2,5,6,1,9};
        for(int turn=0;turn<arr.length;turn++){
            for(int j=0;j<arr.length-1-turn;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
