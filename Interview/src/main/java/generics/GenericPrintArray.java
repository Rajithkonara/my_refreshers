package generics;

public class GenericPrintArray {

    /**
     * Generic method
     * @param input array
     * @param <E> element
     */
    private static <E> void printArray(E[] input) {
        for (E element: input) {
            System.out.println(" "+ element);
        }

    }

    public static void main(String[] args) {
        //Create Integer ,Double and Character Arrays
        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
        Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };

        System.out.println("Array integerArray contains:");
        printArray(intArray);   // pass an Integer array

        System.out.println("\nArray doubleArray contains:");
        printArray(doubleArray);   // pass a Double array

        System.out.println("\nArray characterArray contains:");
        printArray(charArray);   // pass a Character array

    }

}
