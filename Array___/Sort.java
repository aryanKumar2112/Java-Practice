package Array___;

public class Sort {
    public static void main(String[] args) {
        int arr[]={12,23,45,67,78};
        boolean isSorted=false;

        for (int i=0;i<arr.length-1;i++) {
            if(arr[i]<arr[i+1]){
                isSorted=true;
            }

        }
        if(isSorted){
            System.out.println("Array is sorted");
        }
        else
            System.out.println("Array is not sorted");
    }
}
