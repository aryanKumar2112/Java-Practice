package Array___;

import java.util.Arrays;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int nums[]={1,1,2};
        int i=0;
        int j=1;
        while(j<nums.length){
            if(nums[i]!=nums[j]){
                nums[i+1]=nums[j];
                i++;
                j++;
                System.out.println(nums[i+1]);
            }
            else{
                j++;
            }
        }
        System.out.println(i+1);

    }
}
