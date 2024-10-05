package Array_List;
import java.util.*;

public class basic {
    public static void main(String[] args) {
        //take integer type elem
        ArrayList<Integer> list1=new ArrayList<Integer>();

        //add elem in list
        list1.add(4);
        list1.add(6);
        list1.add(8);
        list1.add(9);
        //add elem in between
        list1.add(2,12);

        System.out.println(list1);
        //get elem
        int a=list1.get(3);
        System.out.println(a);

        //find size of list
        int size=list1.size();
        System.out.println(size);

        //delete elem in the list);
    }
}
