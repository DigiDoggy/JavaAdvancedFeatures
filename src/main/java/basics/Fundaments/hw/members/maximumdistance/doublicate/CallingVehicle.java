package basics.Fundaments.hw.members.maximumdistance.doublicate;


public class CallingVehicle {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        Car car = new Car();

        System.out.println(vehicle.maxDistance(70,7,0));
        System.out.println(car.maxDistance(70,7,0,true));

    }
}
