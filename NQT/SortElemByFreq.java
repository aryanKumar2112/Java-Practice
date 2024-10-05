package NQT;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.*;

public class SortElemByFreq {
    public static void main(String[] args) {
        int arr[]={1,2,3,3,3,3,1,1,2,4,5};
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }

        //Array to list conversion
        ArrayList<Integer>list=new ArrayList<>();
        for (int num:arr){
            list.add(num);
        }
        Collections.sort(list,(a,b)->{
            int freqCount=map.get(b)- map.get(a);
            if(freqCount==0){
                return a-b;
            }
            return freqCount;

        });
        System.out.println(list);
    }
}
