package College_work;

public class PyramidABC {
    public static void main(String[] args) {
        for (char  i =1; i <=5 ; i++) {
            for (char j='A'; j<='F'; j++) {
                if(j>=(i+'A')){
                    System.out.print(j-1+" ");
                }
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
