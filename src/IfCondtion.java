import java.util.Scanner;
public class IfCondtion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the price");
        double price= sc.nextDouble();
                if (price>500 ){
            System.out.println("Price is more than 500");
        }else{
            System.out.println("price is less than 500");

        }
    }
}
