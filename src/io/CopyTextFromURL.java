package io;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;

public class CopyTextFromURL {

    public static void main(String[] args) throws IOException {
       //Copy Text from a URL

        Path projectDirectory = Path.of("C:\\Users\\fkhan\\OneDrive\\Java Projects\\newdoc1.txt");
        URI u= URI.create("https://www.cnn.com/");
        InputStream in = u.toURL().openStream();
        Files.copy(in, projectDirectory);
    }
}


