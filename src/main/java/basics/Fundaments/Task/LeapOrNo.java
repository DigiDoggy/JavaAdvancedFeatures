package basics.Fundaments.Task;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class LeapOrNo {
    public static void main(String[] args) {
/*
        Create a JAVA program that determines if year is leap or not. User should enter
        positive value and program should print out either “Leap year” or “Not a leap year”
        How to calculate if it’s a leap year:
 it's divisible by 4 and it's not divisible by 100
 it's divisible by 400, or */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter year, to know leap or not: ");
        int year = scanner.nextInt();

        if (((year%4 == 0) && (year%100 != 0)) || (year%400 == 0)) {
            System.out.println(year + " Is leap year.");
        } else {
            System.out.println(year + " Is not leap year.");
        }
    }
}
