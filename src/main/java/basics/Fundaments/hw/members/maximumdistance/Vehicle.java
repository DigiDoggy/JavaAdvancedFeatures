package basics.Fundaments.hw.members.maximumdistance;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Vehicle {

    private final float fuel;
    private final float fuelUsage;
    private final int passengers;

    public Vehicle(float fuel, float fuelUsage, int passengers) {
        this.fuel = fuel;
        this.fuelUsage = fuelUsage;
        this.passengers = passengers;
    }

    public BigDecimal round(float result) {
        BigDecimal rounding = new BigDecimal(result);
        rounding = rounding.setScale(2, RoundingMode.HALF_UP);
        return rounding;
    }

    public BigDecimal maxDistance() {
        float p = 1;
        if (passengers > 0) {
            p = passengers*0.005f;
        }
        return round((fuel/(fuelUsage/100))*p);
    }


}
