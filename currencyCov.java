package currencyConverter;

public class currencyCov {


    double er = 0;

    public currencyCov(double todayRate) {
        er = todayRate;
    }

    public double DollarToInr(double dollar) {
        double Inr = 0;
        Inr = dollar * er;
        return Inr;
    }

    public double DollarToEuro(double Dollar) {
        double euro = 0;
        euro = Dollar * er;
        return euro;
    }

    public double DollarToYen(double Dollary) {
        double yen = 0;
        yen = Dollary * er;
        return yen;
    }

    public double DollarToPound(double Dollarp) {
        double pound = 0;
        pound = Dollarp / er;
        return pound;
    }

    public double DollarToCad(double Dollarc) {
        double cad = 0;
        cad = Dollarc / er;
        return cad;
    }

    public double InrToDollar(double Inr) {
        double Dollar = 0;
        Dollar = Inr * er;
        return Dollar;
    }
}






