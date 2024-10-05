package NQT;

import java.util.ArrayList;
import java.util.Scanner;

public class Input3 {
    public static void main(String[] args) {
        ArrayList<String>list=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextLine()){
            String s=sc.nextLine();
            if (s.isEmpty()) { // Terminate on empty line
                break;
            }
            list.add(s);
        }
        System.out.println(list);
    }
}
