//Write a program in Java to reverse a String using function.
public class ReverseString {
    public static void main(String[] args) {
        String name = "Hello World";
        String reversedString = "";

        for(int i = name.length()-1; i>=0; i--){
            reversedString = reversedString + name.charAt(i);
        }
        System.out.println(reversedString);
    }
}
