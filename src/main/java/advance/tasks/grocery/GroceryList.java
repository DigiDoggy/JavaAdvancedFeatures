package advance.tasks.grocery;

//TODO:
// 1. addGroceryItem
// 2. printGroceryList
// 3.removeGroceryItem
// 4.modifyGroceryItem
// 5. SearchItem

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GroceryList {

    //Field
    private ArrayList<String> groceryList = new ArrayList<>();
//    private String[] shopList = new String[]{"milk", "sausage", "beef", "muesli", "fruits", "sweets", "eggs", "vegetables"};
    //Constructor
    public GroceryList() {
        groceryList.add("sausage");
        groceryList.add("beef");
        groceryList.add("muesli");
        groceryList.add("fruits");
        groceryList.add("sweets");
    }
    //Methods


    public void addGroceryItem(String item) {
        if (checkIfValid(item)){
            groceryList.add(item);
        } else {
            System.out.println("Item name is not valid");
        }

    }

    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items in your grocery list.");

        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println((i + 1) + ". " + groceryList.get(i));
        }
    }

    private int findItem(String searchItem) {

        return groceryList.indexOf(searchItem);
    }

    public void removeGroceryItem(String item) {
        int position = findItem(item);
        if (position >= 0) {
            groceryList.remove(position);
            System.out.println(item + " deleted.");
        } else {
            System.out.println(item + " is not in the list");
        }
    }

    public void modifyGroceryItem(int position, String newItem) {
        if (checkIfValid(newItem)){
            if (position >= 0 && position < groceryList.size()) {
                System.out.println("Grocery item " + groceryList.get(position) + "was modified");
                groceryList.set(position, newItem);
            } else {
                System.out.println("Item number is not valid");
            }
        }else{
            System.out.println("Item name is not valid");
        }
    }

    public boolean searchItem(String searchItem) {
        if (findItem(searchItem) >= 0) {
            return true;
        } else {
            return false;
        }
    }

    public void deleteAllItems(){
        groceryList.clear();
        System.out.println("All items in the list are deleted");
    }

//    public int random() {
//        return (int) (Math.random()*shopList.length);

//    }

//    public void randomAddToGroceryList() {
//
//        int a = 0;
//            do {
//               String groceryName = String.valueOf((shopList[random()]));
//                if(!groceryList.contains(groceryName)){
//                    groceryList.add(groceryName);
//                    a++;
//                }
//            }while (a!=5);
//        }

   private boolean checkIfValid(String input){
        return Pattern.matches("[a-zA-z ]+[0-9 ]*[a-zA-Z ]*", input);
   }

}