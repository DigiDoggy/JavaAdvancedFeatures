package advance.tasks.grocery;

import java.util.InputMismatchException;
import java.util.Scanner;

//TODO:
// 1. Deleting all items (GroceryList.java) - extra choice in  the menu
// 2. Add 5 default items to the list when running program
// 3. Optional  -  Fix problem with option when entering not number or not number from choice(print "enter valid option").
// 4. Cannot start with number (GroceryList.jva)( check in add method and in modify) Using reg-ex validate that item you are adding to the list is consisting only any number of letter followed by any numbers ( Butter x 5 = true, 5 x Butter = false)
// an the there could be more letters again.
// Butter x 5 test

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();


    public static void main(String[] args) {

        boolean quit = false;
        int choice = 0;

//        randomAddToGroceryList();
        printInstructions();

        while (!quit) {

            System.out.println("Enter your choice.");
            try {
                choice = scanner.nextInt();
//bug fix
                scanner.nextLine();
// для примера сперва расписать места использования методов, потом приступать к разработке методов

                switch (choice) {
                    case 0:
                        printInstructions();
                        break;
                    case 1:
                        //print grocery list
                        groceryList.printGroceryList();
                        break;

                    case 2:
                        // add item
                        addItem();
                        break;
                    case 3:
                        //modify item
                        modifyItem();
                        break;
                    case 4:
                        //remove item
                        removeItem();
                        break;
                    case 5:
                        //search item
                        searchItem();
                        break;
                    case 6:
                        groceryList.deleteAllItems();
                        break;
                    case 7:
                        //quit
                        quit = true;
                        break;
                    default:
                        System.out.println("Input not valid");
                }

            } catch (InputMismatchException e) {
                System.err.println("Wrong input! Integers only!");
//                bug fix
                scanner.nextLine();
            }
        }
    }

    public static void printInstructions(){
        System.out.println("\nPress");
        System.out.println("\t 0 - To print choice options");
        System.out.println("\t 1 - To print the list of grocery items");
        System.out.println("\t 2 - To add an item to the list");
        System.out.println("\t 3 - To modify an item in the list");
        System.out.println("\t 4 - To remove an item from the list");
        System.out.println("\t 5 - To search for an item in the list");
        System.out.println("\t 6 - To remove all item in the list");
        System.out.println("\t 7 - To quit the application");
    }

    public static void addItem(){
        System.out.println("Please enter the grocery item: ");
        groceryList.addGroceryItem(scanner.nextLine());
    }

    public static void modifyItem(){
        System.out.println("Enter item number: ");
        int itemNo = scanner.nextInt();
        //Fixing input bug
        scanner.nextLine();
        System.out.print("Enter replacement item: ");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryItem(itemNo-1,newItem);
    }

    public static void removeItem(){
        System.out.println("Enter item name: ");
        String itemName = scanner.nextLine();
        groceryList.removeGroceryItem(itemName);
    }

    public static void searchItem(){
        System.out.println("Enter item to search for: " );
        String searchItem = scanner.nextLine();
        if(groceryList.searchItem(searchItem)){
            System.out.println("Found " + searchItem + " in our grocery list");
        }else{
            System.out.println(searchItem + " is not in the shopping list");
        }
    }

//    public static void randomAddToGroceryList(){
//        System.out.println("In your list is" );
//        groceryList.randomAddToGroceryList();
//        groceryList.printGroceryList();
//    }




}
