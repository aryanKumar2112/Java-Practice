package College_work;
import java.util.Scanner;
public class CountPrime {
    public static void printPrime(int x){
        for (int i = 1; i <=x; i++) {
            int count=0;
            for (int j = 1; j <=i; j++) {
                if(i%j==0) {
                    count++;
                }
            }
            if(count==2){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printPrime(n);
    }
}
