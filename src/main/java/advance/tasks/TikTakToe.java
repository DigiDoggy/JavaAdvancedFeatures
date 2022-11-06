package advance.tasks;

import java.util.*;

public class TikTakToe {

    private static ArrayList<Integer> playerPositions = new ArrayList<Integer>();
    private static ArrayList<Integer> cpuPositions = new ArrayList<Integer>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        char[][] gameBoard = {{' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '}};

        viewBoard(gameBoard);
        while (true) {
            System.out.println("Enter your position from (1-9): ");
            int pos = scanner.nextInt();


            placePeace(gameBoard, pos, "User");
            Random rand = new Random();
            int cpuPos = rand.nextInt(9) + 1;
            placePeace(gameBoard, cpuPos, "cpu");
            viewBoard(gameBoard);

        }
    }

    public static void viewBoard(char[][] gameBoard){
        for (char[] row: gameBoard) {
            for (char line:row) {
                System.out.print(line);
            }
            System.out.println();
        }
    }

    public static void placePeace(char[][] gameBoard, int pos, String user){
      char symbol = 'X';
      if(user.equals("player")){
          symbol='X';
      }else if(user.equals("cpu")){
          symbol = 'O';
      }

        switch (pos){
            case 1:
                gameBoard[0][0] = symbol;
                break;
            case 2:
                gameBoard[0][2] = symbol;
                break;
            case 3:
                gameBoard[0][4] = symbol;
                break;
            case 4:
                gameBoard[2][0] = symbol;
                break;
            case 5:
                gameBoard[2][2] = symbol;
                break;
            case 6:
                gameBoard[2][4] = symbol;
                break;
            case 7:
                gameBoard[4][0] = symbol;
                break;
            case 8:
                gameBoard[4][2] = symbol;
                break;
            case 9:
                gameBoard[4][4] = symbol;
                break;
            default:
                break;
        }
    }

    public static  String checkWinner(){
        List topRow = Arrays.asList(1,2,3);
        List midRow = Arrays.asList(4,5,6);
        List botRow = Arrays.asList(7,8,9);
        List firstCol = Arrays.asList(1,4,7);
        List secondCol = Arrays.asList(2,5,8);
        List  thirdCol= Arrays.asList(3,6,9);
        List leftCross = Arrays.asList(1,5,9);
        List rightCross = Arrays.asList(3,5,7);

        List<List> winningConditions = new ArrayList<List>();
        winningConditions.add(topRow);
        winningConditions.add(midRow);
        winningConditions.add(botRow);
        winningConditions.add(firstCol);
        winningConditions.add(secondCol);
        winningConditions.add(thirdCol);
        winningConditions.add(leftCross);
        winningConditions.add(rightCross);

        for (List l: winningConditions) {
            if(playerPositions.contains(l)){
                System.out.println("Congratulations you won!");
            } else if (cpuPositions.contains(l)){
                System.out.println("Cpu won!");
            }else{
                System.out.println("TOE!");
            }

        }







        return "";
    }


}
