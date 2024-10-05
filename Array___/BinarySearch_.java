package Array___;

public class BinarySearch_ { 
    public static void main(String[] args) {
        int arr[]={1,3,5,9,45,86,95,124};
        int se=86;
        int ansI=-1;
        int start=0,end=arr.length-1;
        while(start<=end){
            int midI=(start+end)/2;
            if(arr[midI]==se){
                ansI=midI;
                break;
            }
            if(arr[midI]>se){
                end=midI-1;
            }
            else{
                start=midI+1;
            }
        }
        System.out.println(ansI);
            }
        }
