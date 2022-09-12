package freehw.paintcalculation.paint;


public class Grunt extends Dye{
    protected String gruntColor;
    private static final float price = 65;
    private static final int gruntPaintBucket = 20;

    public Grunt(int gruntThickness, String gruntColor) {
        super(gruntThickness);
        this.gruntColor = gruntColor;
    }

    public static int getGruntPaintBucket(){
        return gruntPaintBucket;
    }

    @Override
    public void printDyeInfo() {
        System.out.println("Grunt color is:" + gruntColor);
        System.out.println("Dry film thickness: " + gruntThickness);
    }


}
