import java.io.*;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class InputStreamExample {

    public static void main(String[] args) throws IOException {

        Path p1= Paths.get("Test.txt").toAbsolutePath();
        System.out.println(p1);
        //Path.of method can also be used to get the path of a file
        Path p2= Path.of("Test1.txt").toAbsolutePath();
        System.out.println(p2);

        //Below exampole can be used in command line
       /* InputStream in = Files.newInputStream(Path.of(args[0]));
        OutputStream out = Files.newOutputStream(Path.of(args[1]));*/

        InputStream in = Files.newInputStream(Path.of("Test.txt"), StandardOpenOption.READ);
        OutputStream out = Files.newOutputStream(Path.of("Test1.txt"));

        byte[] data= new byte[10];
        while (in.read(data) !=-1) {
            out.write(data);
        }
        //Copy using transferTo method
        //in.transferTo(out);
        //Files can also be copied using Files.copy method

        in.close();
        out.close();
        
    }

}
