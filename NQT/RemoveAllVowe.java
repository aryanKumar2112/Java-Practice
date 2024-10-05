package NQT;

public class RemoveAllVowe {
    public static void main(String args[]){
        String str="ertgfanokka";
        String str1="";
        for (int i = 0; i < str.length(); i++) {
            char ch= str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                continue;
            }else{
                str1+=ch;
            }
        }
        System.out.println(str1);
    }
}
