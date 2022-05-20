//Write a program in java to check array contains a given value or not.

public class ArrayCheck {
    public static void main(String[] args) {
        String[] names = {"Texas", "Florida","New York","Maine","Ohio","Virginia"};
        String toCheck="Nepal";
        boolean isAvailable= false;

        for (String name: names){
            if(name.equals(toCheck)){
                isAvailable=true;

            }
        }
        if(isAvailable) {
            System.out.println(toCheck + " is available in array.");
        }else{
            System.out.println(toCheck + " is not available in array.");
        }

    }
}
