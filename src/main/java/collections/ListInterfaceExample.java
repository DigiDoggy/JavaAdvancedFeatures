package collections;

import java.util.ArrayList;

public class ListInterfaceExample {
    public static void main(String[] args) {



        //Declaring Arraylist
        ArrayList<String> car = new ArrayList<>();

        // Add elements
        car.add("Volvo");
        car.add("Mercedes");
        car.add("BMW");
        car.add("Jeep");
        car.add("Opel");

        // Print out all elements
        System.out.println(car);

        //Get element by index
        System.out.println(car.get(0));

        //Add elements at specific index
        car.add(2,"Ford");
        System.out.println(car);

        //Change element values:
        car.set(3, "Toyota");
        System.out.println(car);

        // Remove element
        car.remove(5);
        System.out.println(car);

        //size
        System.out.println(car.size());

        //Delete all elements
        car.clear();
        System.out.println(car);

    }
}
