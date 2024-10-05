package ASirStringQ;

public class ReverseAString {
    public static void reverseString(String str){
        String newStr="";
        for (int i  = str.length()-1; i >=0 ; i--) {
            newStr+=str.charAt(i);

        }
        System.out.println(newStr);
    }

    public static void main(String[] args) {
        reverseString("AmitKumarJain");
    }
}
