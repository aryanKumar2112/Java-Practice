package Array___;

import java.util.Arrays;

public class ArrRevWithoutUsinSpace {
    public static void main(String[] args) {
        //in place means we are not allows to use extra space
        //in swapping loop i<j
        int arr[]={1,2,3,4,5};
        int i=0,j=arr.length-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        System.out.println(Arrays.toString(arr));

    }
}
