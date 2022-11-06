package basics.Fundaments.Task.carpet;

public class Calculator {
    private Floor floor;
    public Carpet carpet;

    public Calculator(Floor floor, Carpet carpet){
        this.floor = floor;
        this.carpet = carpet;
    }

    public  double getTotalCost(){
        return floor.getArea() * carpet.getCost();
    }

}
