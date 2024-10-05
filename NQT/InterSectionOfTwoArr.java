package NQT;

import java.util.HashSet;

public class InterSectionOfTwoArr {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,10};
        int arr2[]={1,9,10,2,11};
        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i< arr.length;i++){
            set.add(arr[i]);
        }
        HashSet<Integer>set1=new HashSet<>();
        for (int i = 0; i < arr2.length; i++) {
            if(set.contains(arr2[i])){
               set1.add(arr2[i]);
            }
        }
        for(int a:set1){
            System.out.println(a);
        }
    }
}
