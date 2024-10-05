package Array___;

import java.util.Arrays;

public class renoveElem {
    public static void main(String[] args) {
        int k=0;
        int nums[]={3,2,2,3};
        int val=3;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=val){
                nums[k]=nums[i];
                k++;

            }
        }
        System.out.println(Arrays.toString(nums));
        System.out.println(k);
    }
}
