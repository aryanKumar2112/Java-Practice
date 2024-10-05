package College_work;

import java.util.Scanner;

public class EvenNo {
    static void evenNo(){

        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();

        for (int i = 1; i <=n ; i++) {
            if(i%2==0){
                System.out.println("Even    " + i);
//                break;
            }
        }
    }
    public static void main(String[] args) {

        evenNo();


    }
}
