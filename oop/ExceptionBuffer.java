package oop;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ExceptionBuffer {
    public static void main(String[] args) {
        try{
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            String s= br.readLine();
        }
        catch (Exception e){
            System.out.println(e);
        }
        System.out.println("hello world");
    }
}
