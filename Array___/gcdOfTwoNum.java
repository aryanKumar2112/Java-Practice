package Array___;

public class gcdOfTwoNum {
    public static int getGcd(int a,int b){
        if(b==0){
            return a;
        }
        return getGcd(b,a%b);
//        if(a==0){
//            return b;
//        }
//        return getGcd(b%a,a);
    }

    public static void main(String[] args) {
        int b=56;
        int a=98;
        int ans=getGcd(a,b);
        System.out.println("GCD of 56 and 98 is "+ans);
    }

}
