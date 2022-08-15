package game;

import java.util.Scanner;

public class GameRPS {
    private String player1;
    private String player2;
    public Scanner scanner=new Scanner(System.in);

    //Setter method
    public void setPlayer1(String player1) {
        this.player1 = player1;
    }

    public void setPlayer2(String player2) {
        this.player2 = player2;
    }

    //Getter method

    public String getPlayer1() {
        return player1;
    }

    public String getPlayer2() {
        return player2;
    }
    public void choiceOfWeapon(){
        System.out.println("Write your choice from \"Rock\", \"Paper\", \"Scissors\".");
    }

    public void getWhoWon(String player1, String player2){


            if (player1.equals("rock")&&player2.equals("rock")){
                System.out.println("TIE");
            } else if (player1.equals("paper")&&player2.equals("rock")) {
                System.out.println("Player1 Won!");
            } else if (player1.equals("scissors")&&player2.equals("rock")) {
                System.out.println("Player2 Won!");
            }
            if (player1.equals("paper")&&player2.equals("paper")){
                System.out.println("TIE");
            }else if (player1.equals("rock")&&player2.equals("paper")) {
                System.out.println("Player2 Won!");
            } else if (player1.equals("rock")&&player2.equals("scissors")) {
                System.out.println("Player2 Won!");
            }

            if (player1.equals("scissors")&&player2.equals("scissors")){
                System.out.println("TIE");
            }  else if (player1.equals("paper")&&player2.equals("scissors")) {
                System.out.println("Player 2 Won!");
            } else if (player1.equals("scissors")&&player2.equals("paper")) {
                System.out.println("Player1 Won!");
            }

    }



    /*
* создаем два игрока
* через метод даем им вырбрать варианты ( камень, ножницы бумага)
* пишем метод победителя
*
*
*
* */
}
