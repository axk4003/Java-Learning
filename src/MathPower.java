// Write a program in java to calculate power of certain number:
import java.util.Scanner;

public class MathPower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num1 = sc.nextInt();
        System.out.println("Enter a second number");
        int num2 = sc.nextInt();
        power(num1, num2);
    }
        public static void power(int num1,int num2) {
        Double resultInDouble=Math.pow(num1,num2);
        int result= resultInDouble.intValue();
            System.out.println("The power of "+num1 +" is "+result + ".");


    }
}
