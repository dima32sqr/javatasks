package tasks.task22;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by Dmytro on 8/9/2015.
 */
public class FileReader {

    String readFile() {
        String content = "";
        try {
            content = new String(Files.readAllBytes(Paths.get("C:\\D\\p022_names.txt")));
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return content;
    }

    public static void main(String[] args) {
        FileReader fr = new FileReader();
        System.out.println(fr.readFile());
    }
}
