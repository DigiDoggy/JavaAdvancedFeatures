package OOP.inheritance;


class Vehicle{
    protected String brand;

    public void honk(){
        System.out.println("Tutu");
        System.out.println("My brand is: " + brand);
    }
}

class Bike extends Vehicle{
  public void honk(){
      System.out.println("Bip Bip");
      System.out.println("My brand is: " + brand);

  }

}




public class VehicleExamples {
    public static void main(String[] args) {

        Vehicle vehicle= new Vehicle();
        vehicle.brand= "Nice";
        vehicle.honk();

        Bike bike = new Bike();
        bike.brand = "Bianchi";
        bike.honk();

    }
}
