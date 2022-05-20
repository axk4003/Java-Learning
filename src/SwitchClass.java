import java.util.Scanner;
public class SwitchClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter num1: ");
        int num1=sc.nextInt();
        System.out.println("enter num2: ");
        int num2=sc.nextInt();
        System.out.println("enter a symbol: ");

       String symbol=sc.next();

        switch (symbol){
            case "+":
                System.out.println("the sum is"+(num1+num2));
                break;
            case "-":
                System.out.println("the diff is"+(num1-num2));
                break;
            case"*":
            System.out.println("the multiplication is "+(num1*num2));
            break;
            default:
                System.out.println("invalid");
        }
    }
}
