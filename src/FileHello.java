import java.io.FileWriter;

public class FileHello {
    public static void main(String[] args) {
        try {
            FileWriter myWriter = new FileWriter("hello.txt", true);
            myWriter.write("Hello My Name is Akankshya Karki");
            myWriter.close();
            System.out.println("Write to file successful.");
        } catch (Exception e) {
        System.out.println("Error" +e.getMessage());
    }
}
}