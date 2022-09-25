package patterns.creational.builder;

public class Main {
    public static void main(String[] args) {
        User user1= new User.UserBuilder("Bob", "Cloud")
                .age(120)
                .phone("+372 3256324234")
                .address("Some City")
                .buid();

        System.out.println(user1);

        User user2 = new User.UserBuilder("Antonio","Banderas")
                .age(62)
                .phone("234423434")
                // No address
                .buid();
        System.out.println(user2);

        User user3 = new User.UserBuilder("Grek", "Tost").buid();

        System.out.println(user3);
    }
}
