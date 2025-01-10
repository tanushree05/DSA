public class Parametrized_Constructor {
    public static void main(String[] args) {
        Student s1=new Student("Tanushree",01);
        s1.print_info();
    }
}
class Student{
    String name;
    int roll_no;

    Student(String name,int roll_no){
        this.name=name;
        this.roll_no=roll_no;
    }

    void print_info(){
          System.out.println(name+" "+roll_no);
    }
}
