package College_work;

import java.util.Arrays;

public class MaxSum {
    public static void main(String[] args) {
       int n=24;
       int x=n/2;
       int y=n/3;
       int z=n/4;
       int sum1=0;
       for(int i=0;i<3;i++){
           sum1+=(x/(i+2));

       }
       if(sum1>x){
           x=sum1;
       }

        sum1=0;
        for(int i=0;i<3;i++){
            sum1+=(y/(i+2));

        }
        if(sum1>y){
            y=sum1;
        }
        sum1=0;
        for(int i=0;i<3;i++){
            sum1+=(z/(i+2));

        }
        if(sum1>z){
            z=sum1;
        }
        System.out.println(x+y+z);
    }

}
