package lesson1.HW;

public class Task1 {

    public static <T> void replaceElements(T[] array, int el1, int el2) {
        checkElement(array, el1);
        checkElement(array, el2);
        replace(array, el1, el2);
    }

    private static <T> void replace(T[] array, int el1, int el2) {
        T temp = array[el1];
        array[el1] = array[el2];
        array[el2] = temp;
    }

    private static <T> void checkElement(T[] array, int el) {
        if (el < 0 || el >= array.length)
            throw new IllegalArgumentException("Invalid index");
    }
    
    public static void main(String[] args) {
        Integer[] intArray = {1, 2};
        display(intArray);
        replaceElements(intArray, 0, 1);
        display(intArray);
    }

    private static void display(Object[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("-----");
    }

}
