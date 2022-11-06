package patterns.behavioral.chain;

public class Dollar20Dispenser implements DispenseChain{
    private DispenseChain chain;

    public void setNextChain(DispenseChain chain){
        this.chain=chain;
    }

    @Override
    public void dispense(Currency cur) {
        if(cur.getAmount()>=20){
            int num = cur.getAmount()/20;
            int reminder = cur.getAmount()%20;
            System.out.println("Dispensing " + num + " 20$ note");
            if (reminder != 0){
                chain.dispense(new Currency(reminder));
            }
        } else {
            chain.dispense(cur);
        }
    }
}
