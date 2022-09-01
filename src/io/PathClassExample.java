package io;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;


public class PathClassExample {
    public static void main(String[] args) throws IOException {

        //File & Path API
        Path p = Path.of(".");

        System.out.println("Path: "+p.toAbsolutePath().normalize().toUri()); //to Uri

        Path p1= Paths.get("Test.txt").toAbsolutePath(); //get absolute path of a file
        System.out.println(p1);

        Path currentDir = Paths.get("."); // currentDir = "."
        Path fullPath = currentDir.toAbsolutePath(); // fullPath = "/Example/example/example"
        Path file1 = currentDir.resolve("Test.txt"); // one = "./Test.txt"
        Path file2 = currentDir.resolve("Test1.txt");
        Path fileName = file1.getFileName(); // fileName = "Test.txt"
        System.out.println(currentDir);
        System.out.println(fullPath);
        System.out.println(file1);
        System.out.println(file2);
        System.out.println(fileName);
        System.out.println("-----------------------");



        }

    }




