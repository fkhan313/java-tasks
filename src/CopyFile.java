import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CopyFile {

    public static void main(String[] args) throws IOException {

        Path p1= Paths.get("Test.txt").toAbsolutePath();
        System.out.println(p1);
        Path p2= Paths.get("Test1.txt").toAbsolutePath();
        System.out.println(p2);



        InputStream in = Files.newInputStream(Path.of(args[0]));
        OutputStream out = Files.newOutputStream(Path.of(args[1]));

        /*InputStream in = Files.newInputStream(Path.of("Test.txt"));
        OutputStream out = Files.newOutputStream(Path.of("Test1.txt"));*/
        byte[] data= new byte[10];
        while (in.read(data) !=-1) {
            out.write(data);
        }
        in.close();
        out.close();

    }

}
