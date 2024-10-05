package oop;
class Student{
    private String name;
    private int  rollN0;
    private String collegeName;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollN0=" + rollN0 +
                ", collegeName='" + collegeName + '\'' +
                '}';
    }

    public Student(String name, int rollN0, String collegeName) {
        this.name = name;
        this.rollN0 = rollN0;
        this.collegeName = collegeName;

    }

}
class StudentDriver{
    public static void main(String[] args) {
        Student anjali=new Student("Anjali",41,"IITB");
        Student aman=new Student("amamn",12,"NITW");
        System.out.println(anjali);
        System.out.println(aman);

    }
}


