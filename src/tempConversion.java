public class tempConversion {
    double cel, fahr;
    tempConversion(double cel, double fahr) {
        this.cel = cel;
        this.fahr = fahr;
    }
    double celToFahr(double cel) {
        double f = ((cel * 1.8)+ 32);
        return f;
    }
    double fahrToCel(double fahr) {
        double c = (fahr - 32)*(5/9);
        return c;
    }
}
