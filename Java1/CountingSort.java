package Java1;

import java.util.Arrays;

public class CountingSort {
    public static void main(String[] args) {
        int arr[]={4,3,5,6,7,9,8,2,3};
        int largest=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        int nums[]=new int[largest+1];
        for (int i = 0; i < arr.length; i++) {
            nums[arr[i]]++;
        }
        int j=0;
        for (int i = 0; i < nums.length; i++) {
            while (nums[i]>0){
                arr[j]=i;
                j++;
                nums[i]--;
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}
