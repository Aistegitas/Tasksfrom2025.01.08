public class ArrayPrinter {
    public static <T> void printArrays(T[] array) {

        for (T element : array) {
            System.out.println(element);
        }
    }
}
