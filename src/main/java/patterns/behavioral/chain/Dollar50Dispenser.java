package patterns.behavioral.chain;

public class Dollar50Dispenser implements DispenseChain{

    private DispenseChain chain;

    public void setNextChain(DispenseChain chain){
        this.chain=chain;
    }

    @Override
    public void dispense(Currency cur) {
        if(cur.getAmount()>=50){
            int num = cur.getAmount()/50;
            int reminder = cur.getAmount()%50;
            System.out.println("Dispensing " + num + " 50$ note");
            if (reminder != 0){
                chain.dispense(new Currency(reminder));
            }
        } else {
            chain.dispense(cur);
        }
    }
}
