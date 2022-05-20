import java.util.Scanner;
public class SimpleInterest{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter principle:" );
        double p= sc.nextDouble();
        System.out.println("Enter t:" );
        int t = sc.nextInt();
        System.out.println("Enter r:" );
        double r = sc.nextDouble();
        double si=p*t*r/100;
        System.out.println("Simple Interest: " +si);





    }
}