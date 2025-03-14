public class Stringg{
    public int multiply(int numOne,int numTwo){
        int numThree = numOne*numTwo;
        return numThree;
    }
    public static void main(String args[])
    {
        Stringg obj = new Stringg();
        int c=obj.multiply(10,20);
        System.out.println(c);
    }
}