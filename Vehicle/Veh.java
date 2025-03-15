import java.util.*;
public class Veh
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("\n1.Car\n2.Truck");
        int truck =sc. nextInt();
        System.out.println("Enter the choice:");
        System.out.println("\n1.Is RFID:");
        System.out.println("\n2 Is not RFID");
        int RFID= sc.nextInt();
         if(truck==1)
        {
            if(RFID==1){

            double percent = 100 * 0.1;
            double tollfee1 = 100 - percent;
            System.out.println("the toll fee is :" + tollfee1);
        }
        else{
            System.out.println("100");
        }}
        if (truck== 2)
        {
            if(RFID==1)
            {
            double percent2 = 200 * 0.1;
            double tollfee2 =200 - percent2;
            System.out.println("the toll fee is:" + tollfee2);
            }
            else{
                System.out.println("200");
            }
            }

        }
    }

