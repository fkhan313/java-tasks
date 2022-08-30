
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;


public class Main {
    public static void main(String[] args) {

        //File & Path API
        Path p = Path.of(".");
        System.out.println("Path: "+p.toAbsolutePath().normalize().toUri());

        Path p1= Paths.get("Test.txt").toAbsolutePath();
        System.out.println(p1);


        }

    }




