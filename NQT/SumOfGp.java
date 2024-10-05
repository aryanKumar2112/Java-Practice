package NQT;

public class SumOfGp {
    public static void main(String[] args) {
        double a=2.0;
        double r=3.0;
        double n=4.0;
        double sum=0.0;
        for (int i = 1; i <= n; i++) {
            sum+=a;
            a=a*r;
        }
        System.out.println(sum);
    }
}
