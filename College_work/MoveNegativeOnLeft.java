package College_work;

import java.util.Arrays;

public class MoveNegativeOnLeft {
    public static void main(String[] args) {
        int nums[]={-1,-3,8,9,-12,56,-45,67,78};
        int arr[]=new int[nums.length];
        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i]>nums[i+1]){
                int temp=nums[i];
                arr[i]=nums[i+1];
                arr[i+1]=nums[i];

            }

        }
        System.out.println(Arrays.toString(nums));

    }
}
