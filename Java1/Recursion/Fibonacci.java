package Java1.Recursion;

public class Fibonacci {
    public static void print(int n){
        for (int i = 0; i < n; i++) {
            System.out.println(printFib(i)+" ");
        }
    }
    public static int printFib(int n){
        if(n==0||n==1){
            return n;
        }
        return printFib(n-1)+printFib(n-2);
    }
    public static void main(String[] args) {
        int num=4;
        printFib(num);
    }
}
