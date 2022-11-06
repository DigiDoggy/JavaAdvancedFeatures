//import java.security.spec.RSAOtherPrimeInfo;
//
//public class Varargs {
//    public static void main(String[] args) {
//
//
//        printNumbers(2,3,4,5,2,1,4,6);
//        System.out.println(4);
//        printArgs(15,5,7,3,4,2,1,3,4,5);
//
//        printFriends("Felix", 12,"Bob", "John", "Pedro","Amanda");
//
//    }
//    public static void printNumbers(int...numbers){
//        for(int num: numbers){
//            System.out.print(num+" ");
//        }
//        System.out.println();
//    }
//
//    public static void printArgs(int age, int...grades){
//        System.out.printf("Your age is %d\n", age);
//        System.out.print("Your grades: ");
//        for (int num: grades){
//            System.out.print(num + " ");
//        }
//        System.out.println();
//    }
//
//    public static void printFriends(String yourName,int yourAge, String...friends){
//        String bestFriend = "";
////        System.out.print("Your Name is %s and you are %d years old.\n",yourName,yourAge);
////
//
//        System.out.println("Ypur friends");
//        for (String name:friends) {
//            if(name.length()>bestFriend.length()){
//                bestFriend=name;
//            }
//            System.out.print(name + " ");
//        }
//        System.out.println();
//
//        System.out.print("Your best friend is %s",bestFriend);
//    }
//
//
//
//
//
//}
