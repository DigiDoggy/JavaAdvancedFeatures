package basics.Fundaments.Task;

import java.util.Random;
import java.util.Scanner;

public class RandomExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Enter maximum value of numbers: ");
        int maxValue = scanner.nextInt();
        int randomNumber = rand.nextInt(maxValue);

        System.out.print("Enter yours number: ");
        int userNumber = scanner.nextInt();

        while (randomNumber != userNumber) {

            System.out.print("Wrong answer.Program have another number. " +
                    "\n Please Enter the number again: ");
            userNumber = scanner.nextInt();
        }

        System.out.println("You are right, program has: " + randomNumber);

    }

}

