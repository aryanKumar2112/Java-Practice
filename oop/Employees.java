package oop;

public class Employees {
    String name;
    int age;
    String post;
    //constructor creation//when object made
    Employees(String name,int age,String post) {
        //this current calling object ko represent krta hai
        this.name=name;
        this.age=age;
       this.post=post;
    }



    @Override
    public String toString() {
        return "Employees{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", post='" + post + '\'' +
                '}';
    }

  /*  public static void main(String[] args) {
        Employees obj=new Employees();
        obj.name="ram saxena";
        obj.age=34;
        obj.post="Backend Devloper";
        System.out.println(obj.toString());*/
    //enhance loop
  public static void main(String[] args) {
      Employees obj = new Employees("ram saxena",34,"Backend Devloper");
      System.out.println(obj.toString());

  }

    }

