package College_work;

public class P3 {
    public static void main(String[] args) {
        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <=i; j++) {
                if(i!=j){
                    System.out.print(" ");
                }
                else
                    System.out.print("*");

            }
            for (int j = 1; j <=9-i*2; j++) {
                System.out.print(" ");
                }
            for (int j = i; j <=
                    i ; j++) {
                if(i==5)
                    System.out.print("");
                else
                    System.out.print("*");

            }
            System.out.println();
            }


        }
    }
