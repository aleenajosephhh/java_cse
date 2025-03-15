import java.util.*;
public class Prime{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = input.nextInt();
        if(number<=1){
            System.out.println("it is not a prime");
        }
        else{
            int count = 0;
            for(int i = 2; i<=number/2; i++)
            {
                if(number%i==0)
                {
                     count = count+1;
                     break;

                }}
            
            if(count == 0)
            {
                System.out.println("it is a prime number");
            }
            else{
                System.out.println("it is not a prime number ");
            }
        
        
        }}}
