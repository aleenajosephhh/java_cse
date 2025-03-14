import java.util.*;
public class Multiple{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("enter the n value");
        int n = input.nextInt();
        int a[] = new int[n];
        int i = 0;
        while(i<n){
            System.out.println("enter the value");
            a[i] = input.nextInt();
            i = i+1;

        }
        while(i<n){
            System.out.println("enetr the values:"+a[i]);
            i = i+1;
        }
    }
}