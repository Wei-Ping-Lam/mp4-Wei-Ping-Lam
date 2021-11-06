package Pizza;
/**
 * Created by Felix on 23.02.2016.
 */
public enum Topping {
    DIETPILLS(0.0),
    MARGHERITA(1000.0),
    SALAMI(1400.0),
    PROSCIUTTO(1200.0);

    public final double calories;

    Topping(double calories) {
        this.calories = calories;
    }
}
