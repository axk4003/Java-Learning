//Write a program in Java to print even number between intervals using method.
import java.util.Scanner;
public class evenMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter start value: ");
        int s = sc.nextInt();
        System.out.println("Enter end value: ");
        int e = sc.nextInt();
        evenNumbers(s, e);
    }
    public static void  evenNumbers(int start,int end){
        for (int i=start;i<=end; i++){
            if (i%2 ==0){
                System.out.println(i+"  is even");
            }

        }

    }


}
