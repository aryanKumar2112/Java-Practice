package College_work;

import java.util.Scanner;

public class If {
    
    
    public static void main(String[] args) {
        System.out.println("Enter the age");
        System.out.println("Enter the name");
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        int age= sc.nextInt();


        for (int i = 0; i < name.length(); i++) {
            System.out.print(name.charAt(i)+" ");
        }
    }
}
