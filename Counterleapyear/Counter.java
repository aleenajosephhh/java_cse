public class Counter{
    public static void main(String args[]){
        int count=0;
        for(int i = 2020;i<2030;i++){
            if(i%4==0)
            {
                count = count+i;
        
            }
            System.out.println(count);
        }
    }
}