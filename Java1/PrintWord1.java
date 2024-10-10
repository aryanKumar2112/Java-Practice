package Java1;
import java.util.*;
public class PrintWord1 {
    public static void print(int n){
        String arr[]={"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
        if(n==0){
            return;
        }
        int rem=n%10;
        n=n/10;
        print(n);
        System.out.print(arr[rem]+" ");

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        print(n);
    }
}
