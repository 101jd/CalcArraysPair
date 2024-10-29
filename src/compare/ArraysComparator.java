package compare;

public class ArraysComparator {
    public static  <T, U> boolean compare(T[] arr1, U[] arr2){
        System.out.println(arr1.getClass());
        return arr1.length == arr2.length
                && arr1.getClass().isInstance(arr2) || arr2.getClass().isInstance(arr1);

    }

}
