package NQT;
import java.util.*;
public class CountingSort {
    public static void main(String[] args) {
        int arr[]={2,3,4,1,1,5,2,3,4};
        int largest=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        int arr1[]=new int[largest+1];
        for (int i = 0; i < arr.length; i++) {
            arr1[arr[i]]++;
        }
        int j=0;
        for (int i = 0; i < arr1.length; i++) {
            while(arr1[i]>0){
              arr[j]=i;
              arr1[i]--;
              j++;
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}
