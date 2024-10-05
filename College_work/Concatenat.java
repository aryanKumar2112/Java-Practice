package College_work;

import java.util.Scanner;

public class Concatenat {
    public static void main(String[] args) {


        String s1="dddnf";
        String s2="nffmc";

        char ch1[]=new char[s1.length()];
        char ch2[]=new char[s2.length()];
        char ch3[]=new char[s1.length()+s2.length()];
        int length= ch1.length+ ch2.length;

        int i=0;

        for ( i = 0; i <= s1.length(); i++) {
            ch1[i]=s1.charAt(i);
        }
        for ( int j = 0; j < s2.length(); j++) {
            ch2[j]=s2.charAt(j);
        }
        for ( int j = 0; j < ch1.length; j++) {
            ch3[j]=ch1[j];
        }
        for ( i = 0; i < ch1.length; i++) {
            System.out.println(ch3[i]);
        }






    }
}
