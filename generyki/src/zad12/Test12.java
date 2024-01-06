package zad12;

import java.util.Arrays;

public class Test12 {

    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4, 5};
        swap(array, 0, 2);
        System.out.println(Arrays.toString(array));
        String[] array2 = {"a", "b", "c", "d", "e"};
        swap(array2, 0, 2);
        System.out.println(Arrays.toString(array2));
        Double[] array3 = {1.0, 2.0, 3.0, 4.0, 5.0};
        swap(array3, 0, 2);
        System.out.println(Arrays.toString(array3));
    }

    public static <T> void swap(T[] array, int index1, int index2) {
        if (array == null) {
            throw new IllegalArgumentException("Array cannot be null");
        }
        if (index1 < 0 || index1 >= array.length || index2 < 0 || index2 >= array.length) {
            throw new IllegalArgumentException("Index out of range");
        }
        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
