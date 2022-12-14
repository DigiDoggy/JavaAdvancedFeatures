package patterns.creational.factory;

public class TestFactory {
    public static void main(String[] args) {
        Computer pc = ComputerFactory.getComputer("pc", "16 GB","500 GB", "2.4 GHZ");
        Computer server = ComputerFactory.getComputer("server", "32 GB", "2 T", "2.9 GHz");
        System.out.println("Factory PC config " + pc);
        System.out.println("Factory server config " + server);
    }
}
