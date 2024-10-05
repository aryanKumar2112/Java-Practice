package oop;

interface father {
    void padhaikaro();
}
interface mother {
    void padhaikaro();
}
public class MultipleInherit implements father,mother {
    public void padhaikaro(){
        System.out.println("math");
    }

    public static void main(String[] args) {

    }
}
