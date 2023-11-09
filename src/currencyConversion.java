public class currencyConversion {
    double usd, eur;
    currencyConversion(double usd, double eur) {
        this.usd = usd;
        this.eur = eur;
    }
    double usdToEur(double usd) {
        double result = (usd * .93);
        double rounded = Math.round(result*100)/100.0d;
        return rounded;
    }
    double eurToUsd(double eur) {
        double result = (eur * 1.07);
        double rounded = Math.round(result*100)/100.0d;
        return rounded;
    }
}
