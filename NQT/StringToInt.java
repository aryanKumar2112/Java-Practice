package NQT;

public class StringToInt {
    public static void main(String[] args) {
        String s="1234";
//        int a=Integer.valueOf(s);
        boolean flag=false;
        if(s.charAt(0)=='-'){
            flag=true;
        }
        double num=0;
        for (int i = 0; i <s.length() ; i++) {
            int a=s.charAt(i)-48;
            num=num*10+a;

        }
        System.out.println(num);
//        int ans=0;
//        int i;
//        for(;i<s.length();i++){
//            int ch=s.charAt(i)-'0';
//            ans=ans*10+ch;
//
//        }
//        if(flag){
//            ans=-ans;
//        }
//        System.out.println(ans);


    }
}
