public class Calc {

    public void add(int numOne, int numTwo) {
        int numThree = numOne + numTwo;
        System.out.println("Sum: " + numThree);
    }

    public void sub(int numOne, int numTwo) {
        int numThree = numOne - numTwo;
        System.out.println("Difference: " + numThree);
    }

    public void multiply(int numOne, int numTwo) {
        int numThree = numOne * numTwo;
        System.out.println("Product: " + numThree);
    }

    public static void main(String args[]) {
        int numOne = 10;
        int numTwo = 20;
        Calc obj = new Calc();
        obj.add(numOne, numTwo);
        obj.sub(numOne, numTwo);
        obj.multiply(numOne, numTwo);
        
    }
}
