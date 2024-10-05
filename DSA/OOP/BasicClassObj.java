package DSA.OOP;

public class BasicClassObj {
    public static void main(String[] args) {
        Pen p1=new Pen();
        p1.setColor("blue");
        System.out.println(p1.color);

        p1.setTip(5);
        System.out.println(p1.tip);

        //2nd way to write after once
        p1.color="yellow";
        System.out.println(p1.color);

        Student s1=new Student();
        s1.calcPercentage(98,89,99);
        System.out.println(s1.percentage);
    }
}
class Pen {
    String color;
    int tip;
    void setColor(String newColor){
        color=newColor;
    }
    void setTip(int newTip){
        tip=newTip;
    }
}
class Student{
    String name;
    int age;
    float percentage;
    void calcPercentage(int phy,int chem, int math){
        percentage=(phy+chem+math)/3;
    }

}