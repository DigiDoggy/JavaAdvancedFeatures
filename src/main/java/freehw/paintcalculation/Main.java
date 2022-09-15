package freehw.paintcalculation;

import freehw.paintcalculation.data.Storage;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

//        getCompanyName();
//        getColor();
//        getFinishThicknessFromClient();
//        getGruntThicknessFromClient();
//        getMetalAreaFromClient();
//
//        ClientPath.getCustomerInfo();

//        System.out.println(AmountOfGrunt.getBucketGrunt());
//        System.out.println(AmountOfGrunt.getLitersToStorage());

        Operation.getProjectIfo();

//        System.out.println(Storage.getFinishStorage().indexOf(0));

//       Operation.getProjectIfo();




    }

    public static String getColor() {
        System.out.println("Enter finish color: ");
        ClientPath.setFinishColor(scanner.nextLine());
        return ClientPath.getFinishColor();
    }

    public static String getCompanyName() {
        System.out.println("Enter your company name: ");
        ClientPath.setCompanyName(scanner.nextLine().toLowerCase());
        return ClientPath.getCompanyName();
    }

    public static int getGruntThicknessFromClient() {
        System.out.println("Enter grunt thickness (40,50,60): ");

        ClientPath.setGruntThickness(Operation.getInt());
        if (ClientPath.getGruntThickness() != 40 &&
                ClientPath.getGruntThickness() != 50 &&
                ClientPath.getGruntThickness() != 60) {
            while (ClientPath.getGruntThickness() != 40 &&
                    ClientPath.getGruntThickness() != 50 &&
                    ClientPath.getGruntThickness() != 60)
            {
                System.out.println("Wrong input, enter grunt thickness (40,50,60):");
                ClientPath.setGruntThickness(Operation.getInt());
            }
        }
        return ClientPath.getGruntThickness();
    }

    public static int getFinishThicknessFromClient() {
        System.out.println("Enter finish thickness (50,80):");
        ClientPath.setFinishThickness(Operation.getInt());
        if (ClientPath.getFinishThickness() != 50 &&
                ClientPath.getFinishThickness() != 80) {
            while (ClientPath.getFinishThickness() != 50 &&
                    ClientPath.getFinishThickness() != 80) {
                System.out.println("Wrong input, enter finish thickness (50,80): ");
                ClientPath.setFinishThickness(Operation.getInt());
            }
        }

        return ClientPath.getFinishThickness();
    }

    public static float getMetalAreaFromClient() {
        System.out.println("Enter area(m^2) of metal: ");
        ClientPath.setMetalArea(Operation.getFloat());
        return ClientPath.getMetalArea();
    }

}