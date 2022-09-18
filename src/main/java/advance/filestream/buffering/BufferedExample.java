package advance.filestream.buffering;

import java.io.*;
import java.util.Scanner;

public class BufferedExample {
   public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException {

        String inputFileName = "Data\\Input.txt";
        String outputFileName = "Data\\Input.txt";


        System.out.println("Please enter text");
        String input = scanner.nextLine();

        writeFile(outputFileName,input);

        readFile(inputFileName);

    }

//    public static void readFile(String inputFileName) throws IOException{
//        BufferedReader in = new BufferedReader(new FileReader(inputFileName));
//        String line;
//        while ((line = in.readLine()) != null) {
//            System.out.println(line);;
//        }
//    }
//
//    public static void writeFile(String outputFileName, String input) throws IOException {
//        BufferedWriter out = new BufferedWriter(new FileWriter(outputFileName));
//        out.write(input);
//        out.close();
//    }


    public static void readFile(String strFile)throws IOException{
        String line;
        BufferedReader in = new BufferedReader(new FileReader(strFile));
        while ((line = in.readLine()) !=null){
            System.out.println(line);
        }
    }

    public static void  writeFile(String strFile, String data)throws IOException{

        BufferedWriter out = new BufferedWriter(new FileWriter(strFile));

        out.write(data);
        out.close();

    }
    //Method for reading
    //input: String(file name)


    //Method for writing data
    //Input: String (file name), String(data)



}
