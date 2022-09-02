package basics.Fundaments.hw.members.maximumdistance;

public class CallingVehicle {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(70,7,0);
        Car car = new Car(70,7,0,true);
        Vehicle vehicle1 = new Vehicle();

        System.out.println(vehicle.maxDistance());
        System.out.println(car.maxDistance());

    }

}
