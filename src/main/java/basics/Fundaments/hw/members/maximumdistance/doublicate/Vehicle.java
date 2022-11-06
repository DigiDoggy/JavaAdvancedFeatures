package basics.Fundaments.hw.members.maximumdistance.doublicate;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Vehicle {
        private float fuel;
        private float fuelUsage;
        private int passengers;


        public float round(float result){
            BigDecimal rounding = new BigDecimal(Double.toString(result));
            rounding = rounding.setScale(2, RoundingMode.HALF_UP);
            return (float) rounding.doubleValue();
        }

        public float maxDistance(float fuel, float fuelUsage, int passengers) {
            float result;
            if (passengers > 0) {
                fuelUsage += fuelUsage*(passengers*0.05);
            }
            result = round((fuel/(fuelUsage/100)));
            return result;
        }

    }




