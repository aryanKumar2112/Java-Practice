package NQT;
import java.util.*;
public class CheckAmstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int oNum=n;
        int sum1=0;
        while(n>0){
            int a=n%10;
            int sum=a*a*a;
            sum1+=sum;
            n/=10;
        }
        if(oNum==sum1){
            System.out.println("Given number "+oNum +" is Amstrong number");
        }
        else{
            System.out.println("Given number "+oNum+" is not a Amstrong number");
        }
    }
}
