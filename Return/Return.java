public class Return{
    public int add(int numOne, int numTwo){
        int numThree = numOne + numTwo;
        return numThree;
    }
    public static void main(String args[])
    {
        Return obj = new Return();
        int c =obj.add(10,20);
        System.out.println(c);
    }
}