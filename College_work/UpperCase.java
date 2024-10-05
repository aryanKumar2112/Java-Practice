package College_work;

import java.util.Scanner;

public class UpperCase {
    public static void main(String[] args) {
        String strUpper;
        int i, ascii;
        char ch;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the String: ");
        strUpper = scan.nextLine();

        int len = strUpper.length();
        char[] strUpperChars = new char[len];
        char[] strLowerChars = new char[len];
        for(i=0; i<len; i++)
            strUpperChars[i] = strUpper.charAt(i);

        for(i=0; i<len; i++)
        {
            ch = strUpperChars[i];
            ascii = ch;
            if(ascii>=65 && ascii<=90)
            {
                ascii = ascii + 32;
                ch = (char)ascii;
                strLowerChars[i] = ch;
            }
            else
                strLowerChars[i] = ch;
        }

        System.out.print("\nString in Lowercase: ");
        for(i=0; i<len; i++)
            System.out.print(strLowerChars[i]);
    }
}
