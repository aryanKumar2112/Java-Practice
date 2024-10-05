package oop;

public class GetterSetter {
    String name;
    int age;
    //non static me object made krna pdta hai

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        GetterSetter obj=new GetterSetter();
        obj.setName("BAldev");
        System.out.println(obj.getName());


    }
}
