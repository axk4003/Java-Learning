//Write a program in Java to find the number is prime  or not using function.
public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println(isPrime(17));
        System.out.println(isPrime(199));
        System.out.println(isPrime(8));
    }
    public static boolean isPrime(int num){
        boolean flag=false;
        for(int i=2; i<=num/2; i++){
            //condition for nonprime number.
            if(num%i==0){
                flag=true;
                break;
            }
        }
        if (!flag)
            return true;
        else
            return false;
    }
}
