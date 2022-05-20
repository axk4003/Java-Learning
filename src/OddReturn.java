//Write a program in Java to print odd number between intervals using methods.
import java.util.Scanner;
public class OddReturn {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter start value: ");
        int a = sc.nextInt();
        System.out.println("Enter end value: ");
        int b = sc.nextInt();
        oddNumbers(a,b);

    }
    public static void oddNumbers(int start, int end){
        for (int i= start; i<=end; i++){
            if(i%2 !=0){
                System.out.println(i+ " is odd.");
            }
        }
    }
}
