package OOPS.OOPS_Concept.Inheritance;

public class Single_inheritance {
    public static void main(String[] args) {
        Circle c=new Circle();
        c.area();
        c.area(2);
    }
}

class Shape{
    public void area(){
        System.out.println("Display area of Shape : ");
    }
}
class Circle extends Shape{
       public void area(int r){
        System.out.println(3.14*r*r);
       }
}
