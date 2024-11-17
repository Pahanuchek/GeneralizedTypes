import java.util.Objects;

public class ArrayComparer {

    public static <T> boolean compareArrays(T[] array1, T[] array2) {
        if (array1 == null || array2 == null) {
            return false;
        }

        if (array1.length != array2.length) {
            return false;
        }

        for (int i = 0; i < array1.length; i++) {
            if (!Objects.equals(array1[i], array2[i])) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Integer[] intArray1 = {1, 2, 3};
        Integer[] intArray2 = {1, 2, 3};
        Integer[] intArray3 = {1, 2, 4};

        System.out.println(compareArrays(intArray1, intArray2)); // true
        System.out.println(compareArrays(intArray1, intArray3)); // false

        String[] strArray1 = {"apple", "banana", "cherry"};
        String[] strArray2 = {"apple", "banana", "cherry"};
        String[] strArray3 = {"apple", "orange", "cherry"};

        System.out.println(compareArrays(strArray1, strArray2)); // true
        System.out.println(compareArrays(strArray1, strArray3)); // false
    }
}
