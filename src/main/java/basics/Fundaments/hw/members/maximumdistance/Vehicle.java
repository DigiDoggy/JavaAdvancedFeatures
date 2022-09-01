package basics.Fundaments.hw.members.maximumdistance;


public class Vehicle {

    private float fuel;



    private float fuelUsage;
    private int passengers;


    public Vehicle(float fuel, float fuelUsage,int passengers){
        this.fuel = fuel;
        this.fuelUsage = fuelUsage;
        this.passengers = passengers;
    }



    public float round(float result){
        float rounding = (float)Math.round((result*100)/100);
        return rounding;
    }

    public float maxDistance(){
        if(passengers>0){
            fuelUsage+=fuelUsage*(passengers*0.05);
        }
            return round(((fuel/fuelUsage)*100));
    }



}
