package game;

import java.util.Scanner;

public class Minesweeper {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";


    private static Scanner scanner = new Scanner(System.in);
    private static int size;
    private static String[][] playGround;


    public static void main(String[] args) {


        System.out.print(ANSI_GREEN+"Enter playground size: "+ANSI_RESET);
        size = scanner.nextInt() + 1;
        String[][] playGround = new String[size][size];
        String[][] copyPlayGround= new String[size][size];
        System.out.print(ANSI_GREEN+"How many mines do you want: "+ANSI_RESET);
        int minesAmount = scanner.nextInt();
        int sum=1;



        for (int i = 0; i < playGround.length; i++) {
            playGround[i][0] = i + "";
            for (int j = 1; j < playGround[0].length; j++) {
                if (i == 0) {
                    playGround[i][j] = j + "";
                } else {
                    playGround[i][j] = "*";
                }

                if(i!=0&&j!=0 || playGround[i][j].equalsIgnoreCase("+")){
                    if (i>1&&i<size&&j>1&&j<size) {
                        playGround[i][j + 1] = sum + "";
                        playGround[i + 1][j] = sum + "";
                        playGround[i - 1][j] = sum + "";
                        playGround[i][j - 1] = sum + "";
                    }
                }else if(playGround[i][j]==sum+""){
                    sum+=1;
                }else{
                }

            }
        }  // Create PlayGround, backend


        for (int i = 0; i < copyPlayGround.length; i++) {

            copyPlayGround[i][0] =ANSI_YELLOW+ i + ""+ANSI_RESET;
            System.out.print(copyPlayGround[i][0] + "\t");

            for (int j = 1; j < copyPlayGround[0].length; j++) {
                if (i == 0) {
                    copyPlayGround[i][j] = ANSI_YELLOW+j + ""+ANSI_RESET;
                    System.out.print(copyPlayGround[i][j] + "\t");
                } else {
                    copyPlayGround[i][j] = ANSI_CYAN+"*"+ANSI_RESET;
                    System.out.print(copyPlayGround[i][j] + "\t");
                }
            }
            System.out.println();
        }// copy PlayGround, this field will be visible to the user
        System.out.println();


      /*  System.out.println("I`m try to use foreach loop for 2d arrays");
        for (String[] indexI:copyPlayGround) {
            for (String indexJ:indexI) {
                System.out.print(indexJ+"\t");
            }
            System.out.println();
        }
        System.out.println();*/ // Checking the clone for work with `forech` loop

        // designate a mine on the field,
        // Field starts with index 1.
        // that field is for program, backend
        for (int k = 0; k < minesAmount; k++) {
            playGround[getRandomNumber(size)][getRandomNumber(size)] = "+";
        }

/*        System.out.println(ANSI_GREEN + "Проверка расстановки мин" + ANSI_RESET);

        for (String[] indexI : playGround) {
            for (String indexJ : indexI) {
                System.out.print(indexJ + "\t");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println(ANSI_CYAN+"Копия массива"+ANSI_RESET);
        for (String[] indexI : copyPlayGround) {
            for (String indexJ : indexI) {
                System.out.print(indexJ + "\t");
            }
            System.out.println();
        }
        System.out.println();

 */ // how looks minefield

        // Create how user can check, there is mine or not.
        while ((linearSearch(playGround, ("+")) != 0)) {   // The game

            System.out.println();

            System.out.print(ANSI_GREEN+"Enter number of line: "+ANSI_RESET);
            int lineNumber = scanner.nextInt();

            System.out.print(ANSI_GREEN+"Enter number of row: "+ANSI_RESET);
            int rowNumber = scanner.nextInt();

            System.out.println();

            if (playGround[lineNumber][rowNumber].equalsIgnoreCase("+")) { // check hit a mine or not
                copyPlayGround[lineNumber][rowNumber] = ANSI_RED + "+" + ANSI_RESET;
            } else {
                copyPlayGround[lineNumber][rowNumber] = ANSI_GREEN + "-" + ANSI_RESET;
            }




            for (String indexI[] : copyPlayGround) { // Copy of playGround Array for user
                for (String indexJ : indexI) {
                    System.out.print(indexJ + "\t");
                }
                System.out.println();
            }
        }

    }


    public static int getRandomNumber( int x) {
        return (int) ((Math.random() * (x - 1)) + 1);
    }

    public static int
    linearSearch(String[][] arr, String elementToSearch) {
        int mountChar = 0;

        for (int i = 1; i < arr.length; i++) {
            for (int j = 1; j < arr[i].length; j++) {
                if (arr[i][j].equals(elementToSearch)) {
                    mountChar += 1;
                }
            }
        }
        return mountChar;
    }

    public static void printArr(String[][] array) {

        for (String[] indexI : array) {
            for (String indexJ : indexI) {
                System.out.print(indexJ + "\t");
            }
            System.out.println();
        }
        System.out.println();

    }

}
