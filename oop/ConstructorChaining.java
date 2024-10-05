package oop;

public class ConstructorChaining {
    ConstructorChaining(){

        System.out.println("default");
    }
    ConstructorChaining(int age){
        System.out.println(age);
    }
    ConstructorChaining(String name,int age){

        System.out.println(name+" "+age);
    }
    //parent class k variable ko access krne k liye super keyword used


}
