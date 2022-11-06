package patterns.structural.compposit;

public class Triangle implements Shape{

    @Override
    public void draw(String fillColor) {
        System.out.println("Triangle Circle with color: " + fillColor);
    }
}
