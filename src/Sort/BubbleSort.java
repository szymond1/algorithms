package Sort;

import java.util.Arrays;

public class BubbleSort {

    /**
     * Sortowanie liczb calkowitych metoda babelkowa
     */

    public static void main(String[] args) {

        Integer[] array = new Integer[]{7,5,4,18,37,19,24};

        boolean result = false;

        while (!result)
        {
            result = true;
            for (int i =(array.length)-1; i > 0; i--)
            {
                int a = array[i];
                int b = array[i-1];
                if (a < b)
                {
                    array[i] = b;
                    array[i-1] = a;
                    result = false;
                }
            }
        }

        System.out.println("Tablice posortowano: " + Arrays.asList(array).toString());

    }
}
