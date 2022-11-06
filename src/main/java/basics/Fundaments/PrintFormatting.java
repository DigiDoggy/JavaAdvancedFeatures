package basics.Fundaments;

import java.sql.SQLOutput;

public class PrintFormatting {
    public static void main(String[] args) {

        //s - string
        //d - integers/decimals
        //f - float/double
        //c - char
        //b - boolean

        String name = "Bob";
        int age = 34;

        System.out.println("Hello " + name + " your age is " + age);

        System.out.printf("Hello %s your age is %d\n", name, age);

        System.out.printf("Hello %1$s your age is %2$d.\n Nice to meet you %1$s",name,age);

        double height = 192.3454d;
        System.out.printf("%s is %.2f cm tall.", name, height);










    }

}
