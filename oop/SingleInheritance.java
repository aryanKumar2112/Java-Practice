package oop;

public class SingleInheritance {
    class A {
        int a = 10;

        void display() {
            System.out.println("Display");
        }
    }

    class B extends A {
        void fun() {
            System.out.println("fun");
        }
    }


        public static void main(String[] args) {
            SingleInheritance obj1 = new SingleInheritance();


        }
    }

