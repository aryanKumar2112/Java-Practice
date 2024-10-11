package Java1;

public class GetSet {
    public static void main(String[] args) {
        Pen1 p1=new Pen1();
        p1.setColor("Blue");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());
        p1.setColor("Red");
        System.out.println(p1.getColor());
    }
}
class Pen1{
    private String color;
    private int tip;
    String getColor(){
        return this.color;
    }
    int getTip(){
        return this.tip;
    }
    void setColor(String color1){
        this.color=color1;
    }
    void setTip(int tip1){
        this.tip=tip1;
    }
}
