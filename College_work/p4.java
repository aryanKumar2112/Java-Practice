package College_work;

public class p4 {
    public static void main(String[] args) {
        for (int i = 1; i <=3 ; i++) {
            for (int j = 2; j >=i ; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
