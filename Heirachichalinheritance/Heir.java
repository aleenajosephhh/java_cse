class Parent{
    public void add(){
        System.out.println("hello world");
    }
}
class Child extends Parent 
{
    void display(){
        add();
    }
}
class Third extends Parent{
    void helper(){
       add();
    }
}
public class Heir{
    public static void main (String args[]){
        Third obj = new Third();
        obj.helper();
        Child obj1 = new Child();
        obj1.display();
    }
    }