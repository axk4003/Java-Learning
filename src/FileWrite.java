import java.io.FileWriter;

public class FileWrite {
    public static void main(String[] args) {
        try {
            FileWriter fw= new FileWriter ("c://akankshya/birthday.txt");
            fw.write("Happy birthday");
            fw.close();
            System.out.println("file write is successful");
        }catch(Exception e){
            System.out.println("Error");
        }
    }
}
