package College_work;

import java.util.Scanner;

public class Str1 {
    public static void main(String[] args) {
        System.out.println("Enter a word");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int count=1,i=0;
        char charArr[]=str.toCharArray();
        for ( i = 1; i < charArr.length; i++) {
            if(charArr[i-1]==charArr[i]){
                count++;
            }



        }
        System.out.println(count+" "+charArr[0]);


    }
}
