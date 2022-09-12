package advance.filestream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample {
    public FileOutputStreamExample(String s) {
    }

    public static void main(String[] args) throws IOException {

        String test = "Output";

        FileOutputStream out = new FileOutputStream("Data\\Output.txt");

        for (char ch : test.toCharArray()) {
            out.write(ch);
        }


    }
}
