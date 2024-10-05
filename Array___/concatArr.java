package Array___;

public class concatArr {
    public static void main(String[] args) {
        int a[]={44,55,34,23};
        int b[]={12,56,90,78,89,67};

        int c[]=new int [a.length+b.length];
        for(int i=0;i<a.length;i=i+1){
            c[i]=a[i];
        }
        for(int i=0;i<b.length;i=i+1){
            c[a.length+i]=b[i];
        }
        for (int i = 0; i <a.length+ b.length; i++) {
            System.out.println(c[i]);

        }


    }
}
