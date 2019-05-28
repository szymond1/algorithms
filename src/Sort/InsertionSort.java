package Sort;

import java.util.Arrays;

public class InsertionSort {

    /**
     * Sortowanie liczb calkowitych metoda wstawiania(insertion sort)
     */

    public static void main(String[] args) {

        Integer[] array = new Integer[]{99,2,22,11,87,6,13};
        int key;
        int j;
        for (int i = 1; i < array.length ; i++)
        {
            key = array[i];
            j = i -1;
            while (j >= 0 && array[j] > key)
            {
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = key;
        }

        System.out.println("Tablice posortowano: " + Arrays.asList(array).toString());

    }
}
