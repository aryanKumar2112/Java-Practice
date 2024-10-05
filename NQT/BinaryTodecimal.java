package NQT;

public class BinaryTodecimal {
    public static void main(String[] args) {
//        String str="1000";
//        int num=Integer.parseInt(str,10);
//        System.out.println(num);
        int n=8;
        int bin=0;
        int i=0;
        while(n>0){
            int rem=n%2;
          bin+=rem*Math.pow(10,i);
           n/=2;
           i++;
        }
        System.out.println(bin);
    }
}
