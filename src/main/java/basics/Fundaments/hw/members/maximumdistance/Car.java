package basics.Fundaments.hw.members.maximumdistance;


import java.math.BigDecimal;

public class Car extends Vehicle{
    private boolean airConditioner;

    public Car(float fuel, float fuelUsage, int passengers, boolean airConditioner) {
        super(fuel,fuelUsage,passengers);
        this.airConditioner=airConditioner;

//        if(airConditioner=true){
//            fuelUsage+=fuelUsage*0.1f;
//        }

    }


    @Override
    public float maxDistance() {
        return super.maxDistance();
    }


}

