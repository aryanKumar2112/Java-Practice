package ASirStringQ;

public class CopyOneToAnother {
    public static String copy(String str){
        String newStr="";
        for (int i = 0; i < str.length(); i++) {
            newStr+=str.charAt(i);
        }
        return newStr;
    }
    public static void main(String[] args) {
        String newstr=copy("bengaluru");
        System.out.println(newstr);
    }
}
