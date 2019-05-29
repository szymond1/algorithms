package Sort;

import java.util.Arrays;

public class MergeSort {

    /**
     * Sortowanie liczb calkowitych metoda scalania(merge sort)
     */

    public static void main(String[] args) {

        Integer[] array = new Integer[]{99,2,22,11,87,6,13};

        int p = 0;
        int r = array.length - 1;

        if (array.length == 1)
        {
            System.out.println( "Tablica ma 1 element, jest juz posortowana");
        } else {
            mergeSort(array,p,r);

        }
        System.out.println("Tablice posortowano: " + Arrays.asList(array).toString());

    }

    private static void mergeSort(Integer[] array, int p, int r) {
        int q;
        if (p < r) {
            q = (p + r) / 2;
            mergeSort(array, p, q);
            mergeSort(array, q + 1, r);
            merge(array,p,q,r);
        }
    }

    private static void merge(Integer[] array, int pocz, int sr, int kon)
    {
        int i,j,k;
        int t[] = new int[array.length];
        for (i=pocz; i<=kon; i++)
        {
            t[i]=array[i];
            i=pocz;
            j=sr+1;
            k=pocz;
             while (i<=sr && j<=kon) {
                 if (t[i]<t[j])
                     array[k++]=t[i++];
                 else
                     array[k++]=t[j++];
             }
            while (i<=sr) {
                array[k++]=t[i++];
            }

        }

    }
}
