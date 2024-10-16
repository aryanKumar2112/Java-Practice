package Java1;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[]={4,3,5,7,6,9};
        for(int turn=0;turn<arr.length-1;turn++){
            for (int i = 0; i < arr.length - 1 - turn; i++) {
                if(arr[i]>arr[i+1]){
                     int temp=arr[i];
                     arr[i]=arr[i+1];
                     arr[i+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
