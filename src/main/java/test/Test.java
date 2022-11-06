package test;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Test {
    private static ArrayList<String> groceryList = new ArrayList<>();
    private static String[] answers = new String[]{"milk", "sausage", "beef"};
    private static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {




        for (int i = 0;i <= answers.length; i++){
            int randomIndex = (int)(Math.random() * answers.length);
            String tmp = answers[i];
            System.out.println(tmp);
            answers[i] = answers[randomIndex];
            answers[randomIndex]=tmp;
            System.out.println(tmp);
        }




    }




    private static boolean checkIfValid(String input){
            return Pattern.matches("^a-zA-z", input);
        }
        //[a-zA-z]+[0-9]*[a-zA-Z]*



}


