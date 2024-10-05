package NQT;

public class SplitProg {
    public static void main(String[] args) {
        String str="i am a boy, and i am from Bihar";
        String str1[]=str.split("[,\\.\\s]" );
        for (String str2:str1){
            System.out.println(str2);
        }
    }
}
