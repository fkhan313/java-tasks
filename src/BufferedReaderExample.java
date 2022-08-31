import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExample {

    public static void main(String[] args) {

        try {
            BufferedReader br = new BufferedReader
                    (new FileReader("C:\\Users\\fkhan\\OneDrive\\Java Projects\\JavaTasks\\output.txt"));

            String s;
            while ((s= br.readLine()) !=null) {
                System.out.println(s);
            }
            br.close();


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
