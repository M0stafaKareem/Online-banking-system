public class currencyConverterCalculator {

private static final double USDtoEGP = 19.23 ;
private static final double USDtoSAR = 3.76 ;
private static final double USDtoEuro = 1.01 ;
private static final double USDtoUAEdinar = 3.67 ;
private static final double USDtoPoundSterling = 0.87 ;
private static final double USDtoKuwaitDinar = 0.31 ;

private static double convertToUSD(double value ,int targetCurrency){
    
    switch(targetCurrency){
        case 0:
            return value/USDtoEGP ;
        case 1:
            return value/USDtoSAR ;
        case 2:
            return value ;
        case 3:
            return value/USDtoEuro ;
        case 4:
            return value/USDtoUAEdinar ;
        case 5:
            return value/USDtoPoundSterling ;
        case 6:
            return value/USDtoKuwaitDinar ;
        default:
            return 0;
    }
}

public static double convert(double value, int from, int to){
    double ratio = convertToUSD(value, from) ;
    switch(to){
        case 0:
            return ratio * USDtoEGP;
        case 1:
            return ratio * USDtoSAR ;
        case 2:
            return ratio ;
        case 3:
            return ratio * USDtoEuro ;
        case 4:
            return ratio * USDtoUAEdinar ;
        case 5:
            return ratio * USDtoPoundSterling ;
        case 6:
            return ratio * USDtoKuwaitDinar ;
        default:
            return 0;
    }
}
}
