package College_work;

import java.util.Arrays;

public class SortArrayPrint {
    public static void main(String[] args) {
        int arr[]={2,4,3,6,7,5,12,8};
        int n= arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
