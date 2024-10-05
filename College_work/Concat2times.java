package College_work;

import java.util.Arrays;

public class Concat2times {
    public static void main(String[] args) {
        int nums[]={1,2,3,4};
        int n=nums.length;
        int nums1[]=new int[2*n];
        for (int i = 0; i <n ; i++) {
            nums1[i]=nums[i];
        }
        for (int i = 0; i <n ; i++) {
            nums1[nums.length+i]=nums[i];
        }

        System.out.println(Arrays.toString(nums1));
    }
}
