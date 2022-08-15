package game;

public class CallingGameRPS {
    /*
    *                       Plan how Create:
    * C
    * 1) Инициализация - инициализируем переменные
    *
    *
    * */

    public static void main(String[] args) {


        GameRPS GameRPS= new GameRPS();

        GameRPS.choiceOfWeapon();
        String choice;
        do {
            System.out.print("Player1 :\n");
            GameRPS.setPlayer1(GameRPS.scanner.nextLine().toLowerCase());

            System.out.print("Player2 :\n");
            GameRPS.setPlayer2(GameRPS.scanner.nextLine().toLowerCase());

            GameRPS.getWhoWon(GameRPS.getPlayer1(), GameRPS.getPlayer2());

            System.out.println("Do you want play again?\n"
                   + "If you want enter \" Y \" or \" N \"");

            choice=GameRPS.scanner.nextLine().toLowerCase();
        }while (choice.equals("y"));





    }
}
