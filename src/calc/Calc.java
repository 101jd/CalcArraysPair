package calc;

public class Calc {

    public static  <T extends Number, U extends Number> double sum(T a, U b){
        return a.doubleValue() + b.doubleValue();
    }

    public static  <T extends Number, U extends Number> double diff(T a, U b){
        return a.doubleValue() - b.doubleValue();
    }

    public static  <T extends Number, U extends Number> double multiple(T a, U b){
        return a.doubleValue() * b.doubleValue();
    }

    public static  <T extends Number, U extends Number> double divide(T a, U b){
        return a.doubleValue() / b.doubleValue();
    }
}
