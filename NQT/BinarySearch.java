package NQT;

public class BinarySearch {
    public static void main(String args[]){
        int arr[]={1,3,2,4,8,6,7};
        int key=11;
        int low=0;
        int high=arr.length-1;
        while(low<high){
            int mid=(low+high)/2;
            if(arr[mid]==key){
                System.out.println("element is present");
                break;
            }
            else if(arr[mid]>key){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        System.out.println("Element is not present");
    }
}
