package OOP.hw;

import java.util.Scanner;

public class CallingVehicle {
    public static void main(String[] args) {

        Scanner scaner = new Scanner(System.in);


        System.out.println("Enter fuel amount in your vehicle");
        float fuel = scaner.nextFloat();

        System.out.println("Enter your vehicle`s fuel usage per 100 km");
        float fuelUsage = scaner.nextFloat();

        System.out.println("Enter how many passengers will be in vehicle");
        int passengers = scaner.nextInt();

        Vehicle vehicle1 = new Vehicle(fuel,fuelUsage,passengers);
        System.out.printf("Your vehicle can drive maximum of %.2f kilometers", vehicle1.maxDistance());

        System.out.println();
        System.out.println(vehicle1.maxDistance(100,10,4));

//        Vehicle vehicle= new Vehicle();
//
//        System.out.println(vehicle.maxDistance(70,7,0));
    }
}
