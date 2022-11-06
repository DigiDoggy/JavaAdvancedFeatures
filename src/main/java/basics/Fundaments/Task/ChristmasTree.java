package basics.Fundaments.Task;


import java.util.Scanner;

public class ChristmasTree {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(ANSI_BLUE + " Enter Christmas tree high: " + ANSI_RESET);
        int n = scanner.nextInt();
        String[] colors = new String[]{ANSI_BLUE, ANSI_CYAN, ANSI_GREEN,
                ANSI_RED, ANSI_YELLOW, ANSI_WHITE};
        double size = colors.length;
        for (int i = 0; i < n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print(" ");
            }
            for (int y = 1; y <= 2*i + 1; y++) {
                System.out.print(colors[(int) (Math.random()*colors.length)] + "*" + ANSI_RESET);
            }
            System.out.println("");
        }
        for (int i = n; i >= 0; i--) {
            System.out.print(" ");
        }
        System.out.print(ANSI_PURPLE + "#" + ANSI_RESET);
    }
}



