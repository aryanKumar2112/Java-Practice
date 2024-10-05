package College_work;
import java.util.Scanner;
public class Fact {
    public static int calFact(int x){
        int fact=1;
        for (int i = 1; i <= x; i++) {
            fact=fact*i;
        }

        return fact;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        System.out.println("Factorial of "+num+" is "+calFact(num));
    }
}
