package basics.Fundaments.hw.members.maximumdistance.doublicate;

public class Car extends Vehicle{
    private boolean airConditioner;

    public float maxDistance(float fuel, float fuelUsage, int passengers,boolean airConditioner) {
        this.airConditioner=airConditioner;
        if (airConditioner==true) fuelUsage += fuelUsage*0.1f;
        return super.maxDistance(fuel, fuelUsage, passengers);


    }
}