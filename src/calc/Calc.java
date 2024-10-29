package calc;

public class Calc {

    public static  <T, U extends Number> double sum(T a, U b){
        return (double) a + (double) b;
    }

    public static  <T, U extends Number> double diff(T a, U b){
        return (double) a - (double) b;
    }

    public static  <T, U extends Number> double multiple(T a, U b){
        return (double) a * (double) b;
    }

    public static  <T, U extends Number> double divide(T a, U b){
        return (double) a / (double) b;
    }
}
