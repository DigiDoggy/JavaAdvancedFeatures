package advance.filestream.buffering;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;

public class BufferReaderExample {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        BufferedReader br = null;

        String line;
        System.out.println("Please enter file name that you want to read.");

        try {
            br = new BufferedReader(new FileReader("Data\\" + scanner.nextLine()+".txt"));
        }catch (FileNotFoundException e){
            System.out.println(e.getMessage() + " File not found");
        }


        try{
            while ((line= Objects.requireNonNull(br).readLine())!=null){
                System.out.println(line);
            }

        }catch (IOException e){
            System.out.println(e.getMessage() + "Error reading file");

        }

    }
}
