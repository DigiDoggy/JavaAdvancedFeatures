package basics.Fundaments.Task;

import java.sql.SQLOutput;

public class RandomMethodWithteacher {
    public static void main(String[] args) {

        float number = 5.5f;
        System.out.println();


        //Rounding value up
        System.out.println("Ceil : " + Math.ceil(number));

        //Rounding value down
        System.out.println("Floor : "+ Math.floor(number));

        //Rounding according to math rules
        System.out.println(" Round : "+ Math.round(number));

        //Absolute value
        System.out.println("Abs : "+ Math.abs(-56));

        //Power
        System.out.println("Power : " + Math.pow(2,4)); //2в степени 4

        //Casting
        System.out.println((int) number);

        //min
        System.out.println(Math.min(100,105));

        //Max
        System.out.println("Max : " + Math.max(200,203));

        //Max or Min from 3 values
        System.out.println("Max from 3 : " +Math.max(3,Math.max(4,5)));

        //SQRT
        System.out.println("Sqrt : " + Math.sqrt(64));

        //Random
        System.out.println("Random : " + Math.random());
        System.out.println("Random : " + (int) (Math.random()*10)); //0-9
        System.out.println("Random : " + (int) (Math.random()*11)); //0-10
        System.out.println("Random : " + (int) ((Math.random()*10)+ 1)); //1-10




    }

}
