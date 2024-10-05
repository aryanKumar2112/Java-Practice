package ASirStringQ;

public class ToggleOfChar {
    public static void printToggleCase(String str){
        String newStr="";
        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            if(ch>='A'&& ch<='Z'){
                newStr+=(char)(ch+32);
            }
            else if(ch>='a' && ch<='z'){
                newStr+=(char)(ch-32);
            }
            else{
                newStr+=ch;
            }
        }
        System.out.println(newStr);
    }
    public static void main(String[] args) {
        printToggleCase("RkElFFOOemcmcmA");
    }
}
