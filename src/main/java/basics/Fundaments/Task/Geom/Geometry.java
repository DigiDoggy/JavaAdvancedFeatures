package basics.Fundaments.Task.Geom;

public class Geometry {
    public static void main(String[] args) {

        Rectangular rectangular = new Rectangular(5,6);
        rectangular.area();
        rectangular.perimeter();

        Square square = new Square(5);
        square.perimeter();
        square.area();

        System.out.println(square.getSide());


    }
}
