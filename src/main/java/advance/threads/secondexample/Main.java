package advance.threads.secondexample;

public class Main {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        MyRunnable myRunnable = new MyRunnable();

        Thread t1 = new Thread(myThread);
        Thread t2 = new Thread(myRunnable);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("All done!");


    }
}
