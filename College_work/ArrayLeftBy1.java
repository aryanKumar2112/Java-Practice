package College_work;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayLeftBy1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        /*int lIndex=nums[0];
        for(int i=1;i<n;i++){
           nums[i-1]=nums[i];

        }
        nums[n-1]=lIndex;*/
        System.out.println("Enter the value of k");
        int k=sc.nextInt();

        for (int i = 1; i <=k; i++) {
            int lIndex=nums[0];
            for (int j=1;j<n;j++){
                nums[j-1]=nums[j];
            }
            nums[nums.length-1]=lIndex;
        }
        //for printing array
       /* for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }*/

        //for printing array
        System.out.println(Arrays.toString(nums));
    }
}
