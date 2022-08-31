
public class Oddeven{
    public static void oddOrEven(int n){
        int bitMask = 1;
        if((n & bitMask)==0){
            System.out.println("even number");
        }else{
            System.out.println("Odd number");
        }
    }
    public static void main(String args[]){
       oddOrEven(2);
       oddOrEven(5);
       oddOrEven(7);
       oddOrEven(10);
    }
}