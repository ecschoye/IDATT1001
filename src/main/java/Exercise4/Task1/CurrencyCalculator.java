package Exercise4.Task1;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class CurrencyCalculator {
    private static final DecimalFormat df = new DecimalFormat("0.00");

    public static double round(double value, int places){
        if (places < 0) throw new IllegalArgumentException("Can't be less than 0");

        BigDecimal bd = BigDecimal.valueOf(value);
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }

    public double dollarCalculator(double a){
        return round(a*8,2);
    }

    public double euroCalculator(double a){
        return round(a*10.02,2);
    }

    public double sekCalculator(double a){
        return round(a*0.94,2);
    }
}
