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
public class Simple{
    public static void main (String args[]){
        Child obj = new Child();
        obj.display();
    }
    }