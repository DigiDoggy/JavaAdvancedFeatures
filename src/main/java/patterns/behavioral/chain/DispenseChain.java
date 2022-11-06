package patterns.behavioral.chain;

public interface DispenseChain {
    //calling next class in line;
     void setNextChain(DispenseChain nextChain);
     //take argument and type nextChain
     void dispense(Currency cur);

}
