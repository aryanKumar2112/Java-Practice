package NQT;

public class FibonacciSeries {
    public static void main(String args[]){
        int n1=0;
        int n2=1;
        System.out.print(n1+" ");
        System.out.print(n2+" ");
        for (int i = 0; i < 7; i++) {
            int sum=n1+n2;
            System.out.print(sum);
            if(i<6){
                System.out.print(" ");
            }
            n1=n2;
            n2=sum;
        }
    }
}
