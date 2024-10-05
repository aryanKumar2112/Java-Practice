package NQT;

public class AddTwoFraction {
    public static void main(String[] args) {
        int num1=3,num2=4;
        int den1=5,den2=3;
        int n=Math.min(den1,den2);
        int gcd=0;
        for(int i=1;i<=n;i++) {
            if (den1 % i == 0 && den2 % i == 0) {
                gcd = i;
            }
        }
        int lcm=(den1*den2)/gcd;
        int sum=0;

        int a=lcm/den1;
        sum+=a*num1;
         a=lcm/den2;
        sum+=a*num2;
        System.out.println(sum + "/"+lcm);

    }
}
