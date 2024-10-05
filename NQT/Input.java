package NQT;

import java.util.*;

public class Input {
    public static void main(String[] args) {
        String str="45.2,Ram,23;34.2,Mohan,12";
        String arr[]=str.split("[;]");

        ArrayList<Double>list1=new ArrayList<Double>();
        ArrayList<String>list2=new ArrayList<>();
        ArrayList<Integer>list3=new ArrayList<>();

        for (String num:arr){
            String arr1[]=num.split(",");
            list1.add(Double.parseDouble(arr1[0]));
            list2.add(arr1[1]);
            list3.add(Integer.parseInt(arr1[2]));

        }
        /*
        for (String num:arr){
            String arr1[]=num.split(",");
            list1.add(Double.valueOf(arr1[0]));
            list2.add(arr1[1]);
            list3.add(Integer.valueOf(arr1[2]));
        }

         */
        for (int i = 0; i < list1.size(); i++) {
            System.out.println("Double "+list1.get(i)+" String "+list2.get(i)+ " Integer "+list3.get(i));
        }
    }
}
