import java.io.File;  // Import the File class

public class DeleteFile {
    public static void main(String[] args) {
        File myFile = new File("myfile.txt");
        if (myFile.delete()) {
            System.out.println("Successfully deleted the file: " + myFile.getName());
        } else {
            System.out.println("Failed to delete the file.");
        }
    }
}
