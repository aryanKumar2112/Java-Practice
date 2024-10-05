package Array___;

import java.util.Arrays;

public class KtimeRotn {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        //last index=arr.length-1
        int k = 4;
        k = k % arr.length;
        for (int j = 1; j <= k; j++) {
            int t = arr[0];
            for (int i = 1; i < arr.length; i++) {
                arr[i - 1] = arr[i];
            }
            arr[arr.length-1]=t;


        }
        System.out.println(Arrays.toString(arr));

    }
}
