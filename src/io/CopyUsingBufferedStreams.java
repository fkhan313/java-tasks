package io;

import java.io.*;

public class CopyUsingBufferedStreams {

    public static void main(String[] args) {

        try {
            BufferedWriter bw = new BufferedWriter
                    (new FileWriter("C:\\Users\\fkhan\\OneDrive\\Java Projects\\JavaTasks\\output_copy.txt"));
            BufferedReader br = new BufferedReader
                    (new FileReader("C:\\Users\\fkhan\\OneDrive\\Java Projects\\JavaTasks\\output.txt"));

            String s;
            while ((s= br.readLine()) !=null) {
                bw.write(s +"\n");
            }
            br.close();
            bw.close();


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
