package Array___;

public class ThirdMax {
    public static void main(String[] args) {
        int arr[]={5,4,3,2,1,6,7,3,2,1};
        int fMax=Integer.MIN_VALUE;
        int sMax=Integer.MIN_VALUE;
        int tMax=Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>fMax){
                tMax=sMax;
                sMax=fMax;
                fMax=arr[i];
            }
            else if(arr[i]<fMax && arr[i]>sMax){
                tMax=sMax;
                sMax=arr[i];
            }
            else if(tMax<arr[i]){
                tMax=arr[i];
            }
        }
        System.out.println(fMax);
        System.out.println(sMax);
        System.out.println(tMax);
    }
}
