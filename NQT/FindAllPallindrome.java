package NQT;
import java.util.*;
public class FindAllPallindrome {
    public static boolean  checkPallin(int num){
        int newNum=0;
        int oNum=num;
        while(num>0){
            int lastD=num%10;
            newNum=newNum*10+lastD;

            num/=10;
        }
        return oNum==newNum;
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();

        for(int i=num1;i<=num2;i++){
            if(checkPallin(i)){
                System.out.println(i+" ");
            }
        }
    }

}
