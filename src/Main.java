
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;


public class Main {
    public static void main(String[] args) {

        //File & Path API
        Path p = Path.of(".");
        System.out.println("Path: "+p.toAbsolutePath().normalize().toUri()); //to Uri

        Path p1= Paths.get("Test.txt").toAbsolutePath(); //get absolute path of a file
        System.out.println(p1);

        Path currentDir = Paths.get("."); // currentDir = "."
        Path fullPath = currentDir.toAbsolutePath(); // fullPath = "/Example/example/example"
        Path one = currentDir.resolve("Test.txt"); // one = "./Test.txt"
        Path fileName = one.getFileName(); // fileName = "Test.txt"
        System.out.println(currentDir);
        System.out.println(fullPath);
        System.out.println(one);
        System.out.println(fileName);


        }

    }




