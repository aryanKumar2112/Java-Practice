package NQT;

public class PerfectSquare {
    public static void main(String args[]){
        int num=26;
        int a=(int)Math.sqrt(num);
        if(a*a==num){
            System.out.println("valid");
        }else{
            System.out.println("not a valid number");
        }
    }
}
