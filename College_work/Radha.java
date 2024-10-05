package College_work;

import java.util.Scanner;

public class Radha {

    public static double takeLoan(double p,double r,double t){


        double emi=((p*r)*Math.pow(1+r,t))/(Math.pow(1+r,t)-1);
        return emi;


    }
    public static double  takeLoanTotal(double p1,double r1,double t1){


        double emi1=((p1*r1)*Math.pow(1+r1,t1))/(Math.pow(1+r1,t1)-1);
        return emi1;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double p=sc.nextDouble();
        double r=sc.nextDouble();
        double t=sc.nextDouble();
        double p1=sc.nextDouble();
        double r1=sc.nextDouble();
        double t1=sc.nextDouble();
        t=t*12;
        t1=t1*12;


       double a= takeLoan(p,r,t);
       double b= takeLoanTotal(p1,r1,t1);
       if(a>b){
           System.out.println("a's emi is greater "+a);
       }
       else{
           System.out.println("bis emi is greater "+b);
       }

    }
}

