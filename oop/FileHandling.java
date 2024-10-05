package oop;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {
    public static void main(String[] args) throws IOException {
        File folder=new File("C:\\Users\\hp\\Desktop\\abcd");
                //directory=folder both are same
        folder.mkdir();
        File fl=new File("C:\\Users\\hp\\Desktop\\abcd\\kuchh.txt");
        //System.out.println( fl.createNewFile()); produce false because file already exist
       /* System.out.println(fl.createNewFile());
        System.out.println(fl.getAbsoluteFile());
        System.out.println(fl.getName());
        System.out.println(fl.isDirectory();
        System.out.println(fl.delete());*/

        FileWriter fw=new FileWriter(fl);
        fw.write("hello dost kya haal hai");
        fw.close();
/*
//read file data wihout opening file
       / Scanner sc=new Scanner(fl);
        while(sc.hasNext()){
            String data=sc.nextLine ();
            System.out.println(data);
        }
        */
        //read file
        FileReader fr=new FileReader(fl);
        int i=0;
        while((i=fr.read())!=-1){
            System.out.print((char) i);

        }




    }
}
