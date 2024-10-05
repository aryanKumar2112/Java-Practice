package NQT;

public class ReversAString {
    public static void main(String args[]){
        String str="hello";

        String st1="";
        for (int i = 0; i < str.length(); i++)

        {
            char temp=str.charAt(i);
            st1=temp+st1;
        }
        System.out.println(st1);
    }
}
