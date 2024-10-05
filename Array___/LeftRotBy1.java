package Array___;

import java.util.Arrays;

public class LeftRotBy1 {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5};
        //last index=arr.length-1
        int t=arr[0];
        for(int i=1;i<arr.length;i++){
            arr[i-1]=arr[i];
        }
        arr[arr.length-1]=t;
        System.out.println(Arrays.toString(arr));
    }
}
