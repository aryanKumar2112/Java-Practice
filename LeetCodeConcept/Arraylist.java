package LeetCodeConcept;

import java.util.*;
import java.util.Arrays;
import java.util.List;

public class Arraylist {
        public int[][] divideArray(int[] nums, int k) {
            Arrays.sort(nums);
            if (nums.length % 3 != 0) {
                return new int[0][0];
            }

            List<List<Integer>> mainList = new ArrayList<>();
            for (int i = 0; i < nums.length; i += 3) {
                List<Integer> list = new ArrayList<>();
                list.add(nums[i]);
                list.add(nums[i + 1]);
                list.add(nums[i + 2]);
                mainList.add(list);
            }
            for (int i = 1; i < mainList.size(); i++) {
                if (Math.abs(mainList.get(i).get(0) - mainList.get(i - 1).get(0)) > k ||
                        Math.abs(mainList.get(i).get(1) - mainList.get(i - 1).get(1)) > k ||
                        Math.abs(mainList.get(i).get(2) - mainList.get(i - 1).get(2)) > k) {
                    return new int[0][0];
                }
            }
            int arr[][] = new int[mainList.size()][3];
            for (int i = 0; i < mainList.size(); i++) {
                for (int j = 0; j < 3; j++) {
                    arr[i][j] = mainList.get(i).get(j);
                }
            }
            return arr;
        }

        // Your test cases can be written here
        public static void main(String[] args) {
            Arraylist solution = new Arraylist();

            // Test cases
            int[] nums1 = {1, 3, 4, 8, 7, 9, 3, 5, 1};
            int k1 = 2;
            System.out.println("Input: nums = " + Arrays.toString(nums1) + ", k = " + k1);
            System.out.println("Output: " + Arrays.deepToString(solution.divideArray(nums1, k1)));
        }


}
