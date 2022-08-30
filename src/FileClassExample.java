import java.io.File;

public class FileClassExample {

    public static void main(String[] args) {

        // If the file is in the Project folder then you only need to write the file name and extension but if it's
        //not then you need to provide the full path in the new File constructor.

        File file = new File("Test.txt");

        if(file.exists()) {
            System.out.println("That file exists!");
            System.out.println(file.getPath());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.isFile());
            //file.delete();
        }
        else {
            System.out.println("That file doesn't exist :(");
        }
    }

}
