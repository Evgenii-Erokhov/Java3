package lesson1.HW;

import java.util.ArrayList;
import java.util.List;

public class Task2 {

    public static <T> List<T> transform(T[] array) {
        List<T> list = new ArrayList<>();
        for (T value : array) {
            list.add(value);
        }
        return list;
    }


    public static void main(String[] args) {
        Integer[] intArr = {1, 2, 3};
        List<Integer> intList = transform(intArr);
        System.out.println(intList.getClass().getSimpleName() + " : " + intList);
    }

}
