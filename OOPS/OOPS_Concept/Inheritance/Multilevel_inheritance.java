package OOPS.OOPS_Concept.Inheritance;

public class Multilevel_inheritance {
    public static void main(String[] args) {
        Breath b=new Breath();
        b.properties();
    }
   
}

class Human{

    public void properties(){
       System.out.println("Human Properties");
    }
}
class Eat extends Human{
    @Override
    public void properties(){
        super.properties();
        System.out.println("Human can eat");
    }
}
class Breath extends Eat{
    @Override
    public  void properties() {
        super.properties();
        System.out.println("Human can Breath");
    }
}
