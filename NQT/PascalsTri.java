package NQT;

public class PascalsTri {
    public static void main(String[] args) {
        int n=4;
        for (int line = 1; line <=n ; line++) {
            for (int j = 0; j <n-line; j++) {
                System.out.print(" ");
            }
            int c=1;
            for (int i = 1; i <= line; i++) {
                System.out.print(c+" ");
                c=c*(line-i)/i;
            }
            System.out.println();
        }
    }
}
