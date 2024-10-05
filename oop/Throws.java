package oop;

import java.util.Scanner;

public class Throws {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        if(age<18){
            throw new Exception("you are not eligible");
        }
        else
            System.out.println("you are eligible for further process");

        System.out.println("hello world");
        System.out.println("hello world");
    }
}
