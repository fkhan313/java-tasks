import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample {

    public static void main(String[] args) {

        try {
            BufferedWriter bw = new BufferedWriter
                    (new FileWriter("C:\\Users\\fkhan\\OneDrive\\Java Projects\\JavaTasks\\output.txt"));
            bw.write("Car\n");
            bw.write("Boat\n");
            bw.write("Aircraft\n");
            bw.write("Helicopter\n");
            bw.close();

            //if the file doesn't exist, it will be created the first time. If it already exists, it will be overwritten.

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }


}
