package Array___;

public class SortedOrNot {
    public static void main(String[] args) {
        int []arr={1,2,3,5,10,9};
        boolean isSorted=true;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]>arr[i+1]){
                isSorted=false;//!true
                break;

            }

        }
        System.out.println(isSorted);

    }
}
