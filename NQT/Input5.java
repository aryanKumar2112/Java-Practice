package NQT;

import java.util.*;

public class Input5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<String> stringList = new ArrayList<>();
        ArrayList<Integer> integerList = new ArrayList<>();
        ArrayList<Double> doubleList = new ArrayList<>();
        while(true){
            String input=sc.nextLine();
            if(input.isEmpty()){
                break;
            }
            try{
               int num=Integer.parseInt(input);
               integerList.add(num);
            }
            catch(NumberFormatException e1){
               try{
                   Double num=Double.parseDouble(input);
                   doubleList.add(num);
               }
               catch(NumberFormatException e2){
                   stringList.add(input);
               }
            }
        }
        System.out.println(integerList);
        System.out.println(stringList);
        System.out.println(doubleList);
    }
}
