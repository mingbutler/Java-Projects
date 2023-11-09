public class weightConversion {
    double kg, lb;
    weightConversion(double kg, double lb) {
        this.lb = lb;
        this.kg = kg;
    }
    double lbTokg(double lb) {
        double kgWeight = (lb * 0.45359237);
        return kgWeight;
    }
    double kgTolb(double kg) {
        double lbWeight = (kg * 2.2046226218);
        return lbWeight;
    }
}
