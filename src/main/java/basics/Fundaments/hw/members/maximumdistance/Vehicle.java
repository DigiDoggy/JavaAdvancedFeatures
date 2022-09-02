package basics.Fundaments.hw.members.maximumdistance;


import java.math.BigDecimal;
import java.math.RoundingMode;

public class Vehicle {
    protected float fuel;
    protected float fuelUsage;
    protected int passengers;

    public Vehicle(float fuel, float fuelUsage,int passengers){
        this.fuel = fuel;
        this.fuelUsage = fuelUsage;
        this.passengers = passengers;
    }

    public float round(float result){
        BigDecimal rounding = new BigDecimal(Double.toString(result));
        rounding = rounding.setScale(2, RoundingMode.HALF_UP);
        return (float) rounding.doubleValue();
    }

    public float maxDistance(){
        if(passengers>0){
            fuelUsage+=fuelUsage*(passengers*0.05);
        }
            return round(((fuel/fuelUsage)*100));
    }

}
