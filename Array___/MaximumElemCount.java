package Array___;

public class MaximumElemCount {
    public static void main(String[] args) {



    int maxcount=0;
    int nums[]={1,2,3,4,2,6};
    int n=0;
    for(int i=0;i<nums.length;i++){
        int count=0;

        for(int j=0;j<nums.length;j++){
            if(nums[i]==nums[j]){
                count++;

            }
        }
        if(count>maxcount){
            maxcount=count;
            n=nums[i];

       }
    }
        System.out.println(n);
}
}
