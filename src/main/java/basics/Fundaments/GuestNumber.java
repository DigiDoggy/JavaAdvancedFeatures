package basics.Fundaments;

import java.util.Scanner;

public class GuestNumber {
    public static void main(String[] args) {

        int rand, quess;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter max random range ");
        int max = scanner.nextInt();//0-10

        rand = (int) (Math.random()*(max + 1));

        System.out.println("Generated random value : " + rand);

        do {
            System.out.print("Gues the number : ");
            quess = scanner.nextInt();

            if(quess>rand){
                System.out.println("Value is less then your number");
            }else if(quess<rand){
                System.out.println("Value is more then your number");
            }
        } while (rand != quess);

        System.out.println("Congratulations you won! ");

    }
}
