//package game;
//
//import game.RPS.Solutions;
//
//import java.util.Random;
//import java.util.Scanner;
//
//public class ComputerRPS {
//
//    private String computer;
//    private String computer2;
//    private String player;
//    public Scanner scanner = new Scanner(System.in);
//
//    //Getter And Setter Methods
//    public String getComputer() {
//        return computer;
//    }
//
//
//    public void setComputer(String computer) {
//        this.computer = computer;
//    }
//
//    public String getComputer2() {
//        return computer2;
//    }
//
//    public void setComputer2(String computer2) {
//        this.computer2 = computer2;
//    }
//
//    public String getPlayer() {
//        return player;
//    }
//
//    public void setPlayer(String player) {
//        player = player;
//    }
//
//    // Method Choice your weapon
//    public void choiceOfWeapon(){
//
//        System.out.println("Write your choice from \"Rock\"," +
//                " \"Paper\", \"Scissors\".");
//    }
//
//    //Random method for pc
//    public int getRandom(){
//        Random random= new Random();
//        int randomNumber= random.nextInt(3);
//        return randomNumber;
//    }
//
//    //Methods for definition PC
//
//    public void computerMove(){
//        switch (getRandom()){
//            case 0:
//                computer.equals("Rock");
//                break;
//            case 1:
//                computer.equals("Paper");
//                break;
//            default:
//                computer.equals("Scissors");
//        }
//        System.out.println("PC2 choice is: " + computer);
//    }
//
//    public void computer2Move(){
//        switch (getRandom()){
//            case 0:
//                computer2.equals("Rock");
//                break;
//            case 1:
//                computer2.equals("Paper");
//                break;
//            default:
//                computer2.equals("Scissors");
//        }
//
//        System.out.println("PC choice is: " + computer2);
//    }
//
//    public String playerMove(){
//        player=scanner.nextLine().toLowerCase();
//        return player;
//    }
//
//    public void gameRPS2ComputerWithPlayer(String computer, String computer2,String player){
//        if (computer.equals("rock") && computer2.equals("rock") && player.equals("rock")){
//            System.out.println("TIE");
//            } else if (computer.equals("rock") && computer2.equals("rock") && player.equals("paper")) {
//            System.out.println("Player WIN! ");
//        } else if (computer.equals("rock")&& computer.equals("paper")&& player.equals("paper")) {
//            System.out.println("Computer lose, computer 2 and player plays again.");
//        } else if (computer.equals("paper")&&computer.equals("paper")&& player.equals("paper")){
//            System.out.println("TIE");
//            } else if (computer.equals("paper")&&computer2.equals("paper")&& player.equals("rock")) {
//            getComputer();
//            getComputer2();
//            if (computer.equals("rock")&&computer2.equals("rock")){
//                System.out.println("TIE");
//            } else if (computer.equals("paper")&&computer2.equals("rock")) {
//                System.out.println("computer Won!");
//            } else if (computer.equals("scissors")&&computer2.equals("rock")) {
//                System.out.println("computer2 Won!");
//            }
//            if (computer.equals("paper")&&computer2.equals("paper")){
//                System.out.println("TIE");
//            }else if (computer.equals("rock")&&computer2.equals("paper")) {
//                System.out.println("computer2 Won!");
//            } else if (computer.equals("rock")&&computer2.equals("scissors")) {
//                System.out.println("computer2 Won!");
//            }
//
//            if (computer.equals("scissors")&&computer2.equals("scissors")){
//                System.out.println("TIE");
//            }  else if (computer.equals("paper")&&computer2.equals("scissors")) {
//                System.out.println("Player 2 Won!");
//            } else if (computer.equals("scissors")&&computer2.equals("paper")) {
//                System.out.println("computer Won!");
//            }
//        }else if (computer)
//    }
//
//
//
//
//
//
//}
