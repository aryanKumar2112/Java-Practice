package NQT;
import java.util.*;
public class PrintRepeatedElem {
    public static void main(String args[]){
        int arr[]={1,2,1,2,2,3,4,5,1};
        ArrayList<Integer>list=new ArrayList<>();
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]) {
                if (!list.contains(arr[i])) {
                    list.add(arr[i]);
                }

            }
        }
//        int arr1[]=new int[list.size()];
//        for (int i = 0; i < list.size(); i++) {
//            arr1[i]=list.get(i);
//        }
//        for (int i = 0; i < arr1.length; i++) {
//            System.out.print(arr1[i]+" ");
//        }

        Object []arr1=list.toArray();
        for(Object obj:arr1){
            System.out.print(obj+" ");
        }

    }
}
