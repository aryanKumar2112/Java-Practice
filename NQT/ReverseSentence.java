package NQT;

public class ReverseSentence {
    public static void main(String[] args) {
        String str="program amazing an is this";
        String arr[]=str.split(" ");
        int i=0;
        int j=arr.length-1;
        while (i<j){
            String temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        String str1="";
        for (int k = 0; k < arr.length; k++) {
           str1+=arr[k];
           if(k<arr.length-1){
               str1+=" ";
           }
        }
        System.out.println(str1);
        System.out.println(str1.length());
    }
}
