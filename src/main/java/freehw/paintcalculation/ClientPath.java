package freehw.paintcalculation;

import freehw.paintcalculation.data.DyeData;

import javax.crypto.spec.PSource;
import java.sql.SQLOutput;
import java.util.Scanner;

public class ClientPath {

    public static Scanner scanner = new Scanner(System.in);
    private static String companyName;
    private static String finishColor;
    private static int gruntThickness;
    private static int finishThickness;
    private static float metalArea;


    public ClientPath(String companyName, float metalArea, int gruntThickness, int finishThickness, String finishColor){

    }


   // Getter and Setters


    public static void setCompanyName(String companyName) {
        ClientPath.companyName = companyName;
    }

    public static String getCompanyName() {
        return companyName;
    }

    public static String getFinishColor() {
        return "red";
    }

    public static void setFinishColor(String gruntColor) {
        ClientPath.finishColor = finishColor;
    }

    public static int getGruntThickness() {
        return 50;
    }

    public static void setGruntThickness(int gruntThickness) {
        ClientPath.gruntThickness = gruntThickness;
    }

    public static int getFinishThickness() {
        return 50;
    }

    public static void setFinishThickness(int finishThickness) {
        ClientPath.finishThickness = finishThickness;
    }

    public static float getMetalArea() {
        return 5000;
    }

    public static void setMetalArea(float metalArea) {
        ClientPath.metalArea = metalArea;
    }



}
