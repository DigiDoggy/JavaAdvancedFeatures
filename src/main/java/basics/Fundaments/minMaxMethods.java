package basics.Fundaments;

public class minMaxMethods {
    public static void main(String[] args) {
        int [] my_array = {10,243,64,23,2,5345,234,54,4,46,600};

        System.out.println(max(my_array));

    }

    //Max
    public static int max(int [] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];

            }
        }

        return max;

    }
    public static void printArr(String[][] array) {

        for (String[] indexI : array) {
            for (String indexJ : indexI) {
                System.out.print(indexJ + "\t");
            }
            System.out.println();
        }
        System.out.println();


    }



}
