package oop;

public class CabServices {

        static {
            System.out.println("Static Block");
        }
        CabServices(){
            System.out.println("Default Constructor");
        }
    {
        System.out.println("Initializer Block");
    }



    public static void main(String[] args) {
        CabServices obj1=new CabServices();
        CabServices obj2=new CabServices();

    }
}
