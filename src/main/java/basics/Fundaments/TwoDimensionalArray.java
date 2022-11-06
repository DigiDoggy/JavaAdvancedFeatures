package basics.Fundaments;

import java.util.Scanner;

public class TwoDimensionalArray {
    public static void main(String[] args) {

//        String[][] dreamCars = new String[2][5];
//
//        dreamCars[0][0] = "Audi";
//        dreamCars[0][1] = "BMW";
//        dreamCars[0][2] = "Opel";
//        dreamCars[0][3] = "Volvo";
//        dreamCars[0][4] = "Lamborghini";
//
//        dreamCars[1][0] = "Lada";
//        dreamCars[1][1] = "Ferrari";
//        dreamCars[1][2] = "Subaru";
//        dreamCars[1][3] = "Saab";
//        dreamCars[1][4] = "McLaren";
//
//        for (int i = 0; i < dreamCars.length; i++) {
//            for (int j = 0; i < dreamCars[i].length; j++) {
//                System.out.println(dreamCars[i][j]);
//            }
//        }


        Scanner scanner = new Scanner(System.in);
        String[][] quizArray = new String[4][4];
        int[] answer = {3,1,2,2};
        int score = 0;


        quizArray[0][0] = "Capital city of Australia?";
        quizArray[0][1] = "Sydney";
        quizArray[0][2] = "Melbourne";
        quizArray[0][3] = "Canberra";

        quizArray[1][0] = "Capital city of USA?";
        quizArray[1][1] = "Washington";
        quizArray[1][2] = "New York";
        quizArray[1][3] = "Dallas";

        quizArray[2][0] = "Capital city of Brazil?";
        quizArray[2][1] = "Rio de Janeiro";
        quizArray[2][2] = "Brasilia";
        quizArray[2][3] = "San paulo";

        quizArray[3][0] = "Capital city of  Canada?";
        quizArray[3][1] = "Montreal";
        quizArray[3][2] = "Ottawa";
        quizArray[3][3] = "Calgary";

        for (int i = 0; i < quizArray.length; i++) {

            //Printing question
            System.out.println(quizArray[i][0]);

            //printing answers


            for (int j = 1; j < quizArray[i].length; j++) {
                System.out.println("\t" + j + ")" + quizArray[i][j]);
            }

            System.out.println("Answer (1-3): ");
            int answerInput = scanner.nextInt();

            if (answerInput==answer[i]){
                System.out.println("Correct" + "\n------------\n------------");
                score++;
            }else{
                System.out.println("False" + "\n------------\n------------");
            }

        }

        System.out.println("You have answered correct to "+ score + " questions.");
    }
}
