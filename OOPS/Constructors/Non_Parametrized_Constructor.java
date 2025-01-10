public class Non_Parametrized_Constructor {
    public static void main(String[] args){
        Student s1=new Student();

    }
}

class Student{
    String name;
    int roll_no;
    

    Student(){
        System.out.println("Student Information");
    }
}
