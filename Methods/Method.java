public class Method{
    public void add(int numOne,int numTwo)
    {
        int numThree = numOne+numTwo;
    System.out.println(numThree);

}
public static void main(String args[])
{
    int numOne=10;
    System.out.println(numOne);
    System.out.println("welcome");

    Method obj = new Method ();
    obj.add(10,20);
}}