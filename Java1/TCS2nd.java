package Java1;
import java.util.*;
public class TCS2nd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String arr[]=str.split(",");
        for (int i = 0; i < arr.length; i++) {
            int num=Integer.parseInt(arr[i]);
            if(num%2!=0){
                System.out.println("False");
            }

        }

    }
}
