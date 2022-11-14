package pl.pjwstk.s18946;

public class CurrencyOperations {

    public double dollarToEuro(double dollars) {
        return dollars * 1.01;
    }

    public double euroToDollar(double euros) {
        return euros * 0.99;
    }

    public double dollarToPLN(double dollars) {
        return dollars * 4.84;
    }

    public double plnToDollar(double pln) {
        return pln * 0.21;
    }

    public double euroToPLN(double euros) {
        return euros * 4.78;
    }

    public double plnToEuro(double pln) {
        return pln * 0.21;
    }

    public double addDollarsAndEuro(double dollars, double euro) {
        return dollars + euroToDollar(euro);
    }

    public double addEuroAndDollars(double euro, double dollars) {
        return euro + dollarToEuro(dollars);
    }

    public double addDollarsAndEuroToPLN(double dollars, double euro) {
        return dollarToPLN(dollars) + euroToPLN(euro);
    }

    public double subEuroFromDollarsToPLN(double dollars, double euro) {
        return dollars + euroToDollar(euro);
    }
}
