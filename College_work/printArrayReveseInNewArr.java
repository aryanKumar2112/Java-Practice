package College_work;

import java.util.Scanner;

public class printArrayReveseInNewArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        int nums1[] = new int[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            int k = 0;
            nums1[k] = nums[i];
            k++;
            System.out.println(nums1[k-1]);
        }

    }
}
