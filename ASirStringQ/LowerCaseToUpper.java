package ASirStringQ;

public class LowerCaseToUpper {
    public static void upperCase(String str){
       String newStr="";
        for (int i = 0; i < str.length(); i++) {
            char c=(char)(str.charAt(i)-32);
            newStr+=c;
        }
        System.out.println(newStr);
    }
    public static void main(String[] args) {
        upperCase("qwedfrtg");
    }
}
