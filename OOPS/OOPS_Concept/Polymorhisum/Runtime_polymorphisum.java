package OOPS.OOPS_Concept.Polymorhisum;

public class Runtime_polymorphisum {
    public static void main(String[] args) {
        Shape s=new Shape();
        s.area();
        Rectangle r=new Rectangle();

        r.area(8,15);

        Circle c=new Circle();

        c.area(2);
    }
}

class Shape{
    public void area(){
        System.out.println("Display area of shape :");
    }

}
class Rectangle extends Shape{
      public static void area(int h,int b){
        System.out.println(0.5*b*h);
      }

}
class Circle extends Shape{
    public static void area(int r) {
        System.out.println(3.14*r*r);
        
    }
}
