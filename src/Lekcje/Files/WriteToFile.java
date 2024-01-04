package Lekcje.Files;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public static void main(String[] args) throws IOException {
        FileWriter writter = new FileWriter("test.txt");
        writter.write("Some text"); // tekst będzie zawsze nadpisywany
        writter.close();
    }
}
