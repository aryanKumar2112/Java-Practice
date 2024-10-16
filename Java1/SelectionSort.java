package Java1;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[]={4,3,5,7,6,9};
        for (int i = 0; i < arr.length; i++) {
            int minPos=i;
            for(int j=i+1;j< arr.length;j++){
                if(arr[minPos]>arr[j]){
                    minPos=j;
                }
            }
            int temp=arr[minPos];
            arr[minPos]=arr[i];
            arr[i]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
