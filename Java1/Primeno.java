package Java1;
import java.util.*;
public class Primeno {
    public static boolean checkPrime(int n){
        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       boolean num= checkPrime(n);
        System.out.println(num);

    }
}
