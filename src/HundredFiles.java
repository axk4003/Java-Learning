import java.io.File;
public class HundredFiles {
    public static void main(String[] args) {
        try {
            for (int i = 1; i <= 100; i++) {
                File f = new File("File" + i + ".txt");
                if (f.createNewFile()) {
                    System.out.println(f.getName() + "has been successfully created.");
                } else {
                    System.out.println("Seems like file already exist.");
                }
            }
        } catch (Exception e) {
            System.out.println("An error occured."+e.getMessage());
        }
    }
}
