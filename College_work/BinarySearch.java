package College_work;

public class BinarySearch {
    public static void main(String[] args) {
        int nums[]={23,34,87,90,98,99};
        int low=0;
        int key=99;
        int high= nums.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==key){
                System.out.println(mid);
                break;
            }
            if(nums[mid]>key){
                high=mid-1;
            }
            if(nums[mid]<key){
                low=mid+1;
            }
        }
        System.out.println("-1");

    }
}
