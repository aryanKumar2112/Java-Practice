package oop;

abstract class Q{
    abstract void display();
    void print(){
        System.out.println("print");
    }
}
abstract class F extends Q{
    abstract void display();
}
public class Abstract1 extends F{
    void display(){
        System.out.println("hello world");
    }

    public static void main(String[] args) {

    }

}
