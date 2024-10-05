package Array___;

import java.util.ArrayList;

public class NQTPractice1 {
    public static void main(String args[]){
        int num=4554;
        ArrayList<Integer>list=new ArrayList<>();
        while(num>0){
            list.add(num%10);
            num/=10;
        }
        int i=0;
        int j=list.size()-1;
        while(i<j){
            if(list.get(i)==list.get(j)){
                i++;
                j--;
            }
            else{
                System.out.println("false");
                break;
            }
        }
        if(i>j || i==j) {
            System.out.println("true");
        }
    }
}
