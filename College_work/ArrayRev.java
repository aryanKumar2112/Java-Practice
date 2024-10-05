package College_work;

import java.util.Arrays;

public class ArrayRev {
    public static void main(String[] args) {


    int nums[]={23,34,12,56,65,89};
    int i=0;
    int j=nums.length-1;

    while(i<j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
        i++;
        j--;
    }
        System.out.println(Arrays.toString(nums));

}
}
