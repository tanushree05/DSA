package OOPS.Constructors;

public class Copy_Constructor {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="Tanushree";
        s1.roll_no=1;
        Student s2=new Student(s1);

        s2.print_info();
    }
}
class Student{
    String name;
    int roll_no;

    Student(Student s2){
        this.name=s2.name;
        this.roll_no=s2.roll_no;

    }

    void print_info(){
        System.out.println(name+" "+roll_no);
    }
    Student(){

    }
}
