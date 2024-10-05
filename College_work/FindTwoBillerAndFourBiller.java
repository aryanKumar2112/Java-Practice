package College_work;

import java.util.Scanner;

public class FindTwoBillerAndFourBiller {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of vehicle");
        int v=sc.nextInt();
        System.out.println("Enter the no of tyres");
        int w=sc.nextInt();
        int noTwo;
        int noFour;

        if(w%4==0){
           noTwo=(4*200-540)/2;
            System.out.println(noTwo);
            noFour=v-noTwo;
            System.out.println(noFour);
        }

}
}
