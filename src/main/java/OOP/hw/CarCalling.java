package OOP.hw;

import java.util.Scanner;

public class CarCalling {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);


        System.out.println("Enter fuel amount in your vehicle");
        float fuel = scaner.nextFloat();

        System.out.println("Enter your vehicle`s fuel usage per 100 km");
        float fuelUsage = scaner.nextFloat();

        System.out.println("Enter how many passengers will be in vehicle");
        int passengers = scaner.nextInt();

        System.out.println("Will you turn on air conditioner? Y/N");
        char input = scaner.next().toLowerCase().charAt(0);

        boolean airConditioner = false;
        if (input=='y'){
            airConditioner = true;
        }

        Car car = new Car(fuel, fuelUsage,passengers,airConditioner);
        System.out.printf("Your vehicle can drive maximum of %.2f kilometers", car.maxDistance());


    }
}
