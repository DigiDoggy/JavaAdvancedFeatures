package basics.Fundaments.hw.members.maximumdistance;

public class Car extends Vehicle{
    private final boolean airConditioner;


    public Car(float fuel, float fuelUsage, int passengers, boolean airConditioner) {
        super(fuel,fuelUsage,passengers);
        this.airConditioner=airConditioner;
    }

    @Override
    public float maxDistance() {
               if(airConditioner){
            fuelUsage+=fuelUsage*0.1f;
               }
        return super.maxDistance();
    }


}

