package advance.threads.banckaccount;

public class Main {
    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount("IBAN5423123532",1000.0d);

        Thread t1 = new Thread(){
            @Override
            public void run() {
                for (int i = 0; i<=1000;i++){
                    bankAccount.deposit(1);

                }
            }
        };
        Thread t2= new Thread(){
            @Override
            public void run() {
                for (int i=0;i<=1000;i++){
                    bankAccount.withdraw(1);
                }
            }
        };

        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        }catch (Exception e){
            e.printStackTrace();
        }

        bankAccount.seeBalance();

    }
}
