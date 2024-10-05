package College_work;

import java.util.Scanner;

public class PallindromeString {
    public static void pallindrome(String x){
        String str1 = x;
        String str2 = "";
        for (int i = x.length()-1; i >=0 ; i--) {
            str2 = str2 + x.charAt(i);
        }
        System.out.println(str2);

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        pallindrome(str);
//        System.out.println(pallindrome(str));
    }

}
