package oop;


    interface A1{
        void display();
    }
    interface B1 extends A1{

    }
    abstract class D{
        abstract void display();
    }
    public class Interface4 extends D implements A1,B1{
        @Override
        public void display() {

        }

        public static void main(String[] args) {

    }

}
