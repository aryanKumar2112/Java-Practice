package College_work;

public class FindGreatestElem {
    public static void main(String[] args) {
        int nums[]={2,96,69,77,145,20};
        int firstGreatest;
        int secondGreatest;
        if(nums[0]>nums[1]){
            firstGreatest=nums[0];
            secondGreatest=nums[1];
        }
        else {
            firstGreatest = nums[1];
            secondGreatest = nums[0];
        }
        for (int i = 2; i < nums.length ; i++) {
            if(firstGreatest<nums[i]){
                secondGreatest=firstGreatest;
                firstGreatest=nums[i];
            }
            else {
                if(secondGreatest<nums[i]){
                    secondGreatest=nums[i];
                }
            }
        }
        System.out.println("first greatest number is "+firstGreatest);
        System.out.println("Second greatest number is "+secondGreatest);
    }
}
