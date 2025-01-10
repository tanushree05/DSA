package OOPS.OOPS_Concept.Inheritance;

public class Hirachical_inheritance {
    public static void main(String[] args) {
        Human h=new Human();
        h.breath();

        Animal a=new Animal();
        a.eat();
    }
}

class Alive{
     public void breath(){
        System.out.println("Can breath");
     }
     public void eat(){
        System.out.println("Can eat");
     }
}
class Human extends Alive{
    @Override
    public void breath(){
        super.breath();
        System.out.println("Live in city");
    }
}

class Animal extends Alive{
    @Override
    public void eat(){
        super.eat();
System.out.println("Live in forest");
    }
}


