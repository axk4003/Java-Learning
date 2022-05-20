//WAP in JAVA to create a new file named "myfile.csv";
import java.io.File;
public class FileM1 {
    public static void main(String[] args) {
        try{
            File f = new File("myfile.csv");
        if(f.createNewFile()) {
                System.out.println("File Created successfully");
            }else {
            System.out.println("Error while creating file");
        }
            }catch (Exception e){
                System.out.println("Issue occured");
            }
        }
}
