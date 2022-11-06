package advance.threads.firstexample;

public class Main {
    public static void main(String[] args) {
        Thread t1 =new Thread(new Bread("One"));
        Thread t2 = new Thread(new Bread("Two"));
        Thread t3 = new Thread(new Bread("Three"));
        Thread t4 = new Thread(new Bread("Four"));


        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }
}
