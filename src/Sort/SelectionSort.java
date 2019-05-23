package Sort;

import java.util.Arrays;

public class SelectionSort {

    /**
     * Sortowanie liczb calkowitych metoda wybierania(selection sort)
     */

    public static void main(String[] args) {

        Integer[] array = new Integer[]{99,2,22,11,87,6,13};
        int minValue, minNumber;
        for (int i = 0; i < array.length - 1; i++)
        {
            minValue = array[i];
            minNumber = i;
            for (int j = i+1; j < array.length; j++) {
                if (array[j] < minValue) {
                    minValue = array[j];
                    minNumber = j;
                }
            }
            array[minNumber] = array[i];
            array[i] = minValue;
        }

        System.out.println("Tablice posortowano: " + Arrays.asList(array).toString());

    }
}
