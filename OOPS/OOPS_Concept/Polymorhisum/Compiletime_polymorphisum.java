package OOPS.OOPS_Concept.Polymorhisum;

public class Compiletime_polymorphisum {
    
    public static void main(String[] args) {
        Calculator c1 =new Calculator();
        c1.sum(2,3);
        c1.sum(2,3,4);
    }
}
class Calculator{
    int a;
    int b;
    int c;

    public void sum(int a,int b){
        System.out.println(a+b);
    }
    public void sum(int a,int b,int c){
        System.out.println(a+b+c);
    }


}
