package Java1;

public class OOp {
    public static void main(String[] args) {
//       Pen p1=new Pen();
//       p1.setColor("Blue");
//        System.out.println(p1.color);
//
//        p1.setTip(5);
//        System.out.println(p1.tip);
//
//        p1.setColor("Red");
//        System.out.println(p1.color);
        BankAccount newAcc=new BankAccount();
        newAcc.accNo="AryanKumar";
        newAcc.sePassword("123456789");
    }
}
class Pen {
    String color;
    int  tip;

    void setColor(String newColor){
        color=newColor;
    }
    void setTip(int  newTip){
        tip=newTip;
    }
}

class BankAccount{
    String accNo;
    private String password;
    void sePassword(String newPassword){
        password=newPassword;
    }

}
