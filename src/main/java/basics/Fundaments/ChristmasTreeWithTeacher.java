package basics.Fundaments;

import java.util.Scanner;

public class ChristmasTreeWithTeacher {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter tree size");
        int size = scanner.nextInt();

        //levels
        for (int i = 0; i < size;i++){

            //spaces
            for (int j=0;j < size-1-i; j++){
                System.out.print(" ");
            }

            //stars
            for(int j =0; j <i*2+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for (int j=0;j < size-1; j++){
            System.out.print(" ");
        }
        System.out.println("#");

    }
}