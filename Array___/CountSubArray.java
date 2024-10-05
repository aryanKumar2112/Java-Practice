package Array___;

public class CountSubArray {
    public static void main(String[] args) {
        //addition of sub arrays result target
        int arr[]={1,2,3,7,5};
        int ans=0,target=12;
        for (int i = 0; i <arr.length-1 ; i++) {
            int sum=0;
            for (int j = i; j <arr.length ; j++) {

                sum+=arr[j];
                if(sum==target)
                    ans++;
            }
        }
        System.out.println(ans);
    }
}
