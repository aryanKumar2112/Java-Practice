package NQT;

public class ConstructorWithPara {
    int x;
    String str;
    public ConstructorWithPara(int x,String str){
        this.x=x;
        this.str=str;
    }
    public static void main(String[] args) {
        ConstructorWithPara myobj=new ConstructorWithPara(23,"string");
        System.out.println(myobj.x+" "+myobj.str);
    }
}
