package College_work;

public class Arr {
    public static void main(String[] args) {
        int nums[]={1,2,4,6,8,12};
        int target=16;
        for (int i =0; i <nums.length ; i++) {
            if (nums[i]==target)
                System.out.println(i);
            else if (nums[i] > target) {
                nums[i-1]=target;
                System.out.println(i-1);
            }

            }
        }
    }

