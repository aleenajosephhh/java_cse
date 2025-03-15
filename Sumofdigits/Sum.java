import java.util.*;
public class Sum{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("enter the n value");
        int n = input.nextInt();
        int a[] = new int[n];
        int i = 0;
        int j = 0;
        while(i<n){
            System.out.println("enter the value ");
            a[i] = input.nextInt();
            i = i+1;

        }
        j=0;
        int sum = 0;

        while(j<n){
            sum = sum + a[j];
            j = j+ 1;
        }

            System.out.println("Addition:"+(sum));
            
        }
    }
