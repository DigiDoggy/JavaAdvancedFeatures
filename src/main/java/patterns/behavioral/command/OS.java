package patterns.behavioral.command;

public class OS {
    public static void main(String[] args) {

        String osName = System.getProperty("os.name");
        System.out.println("Using: " + osName);

    }
}
