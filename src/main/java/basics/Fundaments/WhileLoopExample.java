package basics.Fundaments;

import java.util.Scanner;

public class WhileLoopExample {
    public static void main(String[] args) {

        // Print "Hello world" 10 times

     /*   int i = 0;
        while (i<10){
            System.out.println("Hello world");
            i++;
        }*/

        Scanner scanner = new Scanner(System.in);
       /* char runAgain = 'y';

        while (runAgain == 'y') {

            System.out.println("While loop");

            System.out.println("Do you want to run again? (y/n)");
            runAgain = scanner.next().charAt(0);

        }*/


        char runAgain = 'y';

        while (runAgain == 'y') {

            System.out.print("Please inter any number: ");
            int input = scanner.nextInt();
            if (input < 0) {
                for (int i = 0; i >= input; i--) {
                    System.out.print(i + " ");
                }
            } else {
                for (int i = 0 ; i<=input;i++){
                    System.out.print(i + " ");
                }
            }
            System.out.println("\n Do you want to run again? (y/n)");
            runAgain = scanner.next().charAt(0);
        }




    }
}
