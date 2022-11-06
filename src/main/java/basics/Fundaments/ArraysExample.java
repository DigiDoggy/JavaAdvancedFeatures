package basics.Fundaments;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysExample {
    public static void main(String[] args) {

//        //Declare array that will store 3 elements of type String
//        String[] names = new String[3];
//
//        //Setting element values using each element`s index
//        names[0] = "Ben";
//        names[1] = "Tom";
//        names[2] = "Bob";
//
//        //Getting values from array
//        System.out.println(names[2]);
//
//        //Length
//        System.out.println(names.length);
//
//        //Second way to declare and initialize array
//        String[] dreamCars = new String[]{"BMW", "Tesla", "Daewoo", "Ferrari"};
//
//       //Iretate through all elements in array with for loop
//        for (int i = 0;i< dreamCars.length;i++){
//            System.out.println(dreamCars[i]);
//        }
//
//        for (String car: dreamCars) {
//            System.out.println(car);

/*        Scanner scanner=new Scanner(System.in);

        System.out.print("Enter array size: ");
       int arraySize = scanner.nextInt();

       //Declare empty array in given size
        int storageArray[] = new int[arraySize];

        System.out.println("Please enter array elements one by one: ");

        for (int i = 0;i <arraySize;i++){
            System.out.print("Please enter elements number " + (i + 1) + " : ");
            storageArray[i] = scanner.nextInt();
        }

        System.out.println(Arrays.toString(storageArray));*/
        int sum = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int arraySize = scanner.nextInt();

        //Declare empty array in given size
        int storageArray[] = new int[arraySize];

        System.out.println("Please enter array elements one by one: ");

        for (int i = 0; i < arraySize; i++) {
            System.out.print("Please enter elements number " + (i + 1) + " : ");
            storageArray[i] = scanner.nextInt();
            sum += storageArray[i];
        }

        System.out.println(Arrays.toString(storageArray));
        System.out.println("Sum of all elements: " + sum);


    }
}
