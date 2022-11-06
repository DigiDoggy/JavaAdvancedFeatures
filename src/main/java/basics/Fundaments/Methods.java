package basics.Fundaments;

public class Methods {
    public static void main(String[] args) {

        printName("Ilja");
        printName("Bob");

        System.out.println(returnName("Lisa"));
        String introText = returnName("Harry");
        System.out.println(introText);

        personInfo("Denny",5);

        System.out.println(sum(1,2,3));




    }

    public static void printName(String name){
        System.out.println("Hello your name is " + name);
    }

    public static String returnName(String name){
        String response = "Hello your name is " + name;
        return response;
    }

    public static void personInfo(String name, int age){
        System.out.printf("Your name is %s and you are %d years old\n",name, age);
    }

    public static int sum(int num1, int num2, int num3){
        return num1+num2+num2;
    }

}
