package compare;

public class ArraysComparator {
    public static  <T, U> boolean compare(T[] arr1, U[] arr2){
        return arr1.length == arr2.length
                && (arr1.getClass().isInstance(arr2.getClass())
        || arr2.getClass().isInstance(arr1.getClass()));
    }
}
