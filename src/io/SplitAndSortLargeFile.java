package io;

import java.io.BufferedReader;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class SplitAndSortLargeFile {

    private static final int SHARD_SIZE = 100;

    public static void main(String[] args) throws Exception {
        //User below code when running in command line
        /*if (args.length != 2) {
            System.out.println("Usage: MakeShards [input file] [output folder]");
            return;
        }
        Path input = Path.of(args[0]);
        Path outputFolder = Files.createDirectory(Path.of(args[1]));*/

        //If code already run before, delete the folder containing all text files before running it again, or else,
        //FileAlreadyExistsException will be returned.

        Path input = Path.of("C:\\Users\\fkhan\\OneDrive\\Java Projects\\JavaTasks\\unsorted.txt");
        Path newDirectory = Path.of("C:\\Users\\fkhan\\Downloads\\test01\\");
        Path outputFolder = Files.createDirectory(newDirectory);

        try (BufferedReader reader = Files.newBufferedReader(input)) {
            int shardNum = 0;
            String word = reader.readLine();
            while (word != null) {
                List<String> shard = new ArrayList<>(SHARD_SIZE);
                while (shard.size() < SHARD_SIZE && word != null) {
                    shard.add(word);
                    word = reader.readLine();
                }
                shard.sort(String::compareTo);
                Path output = Path.of(outputFolder.toString(), getOutputFileName(shardNum));
                try (Writer writer = Files.newBufferedWriter(output)) {
                    for (int i = 0; i < shard.size(); i++) {
                        writer.write(shard.get(i));
                        if (i < shard.size() - 1) {
                            writer.write(System.lineSeparator());
                        }
                    }
                }
                shardNum++;
            }
        }
    }

    private static String getOutputFileName(int shardNum) {
        return String.format("shard%02d.txt", shardNum);
    }

}
