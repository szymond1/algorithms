package Sort;


import java.util.Arrays;

public class CountingSort {

    /**
     * Sortowanie liczb calkowitych metoda zliczeniowaa(counting sort)
     */

    private static Integer[] tabA = new Integer[]{4, 1, 5, 0, 1, 6, 5, 1, 5, 3};

    public static void main(String[] args) {
        int i;

        System.out.println("Zbior przed sortowaniem:");
        for (i=0; i<tabA.length; i++)
            System.out.print(tabA[i] + " ");

        int max = findMax(tabA);

        countingSort(max);

        System.out.println("\nZbior po sortowaniu:");
        for (i=0; i<tabA.length; i++)
            System.out.print(tabA[i] + " ");

    }

    /* Procedura sortowania tab[pocz...kon] */
    private static void countingSort(int max)
    {
        Integer[] equalKeys = countEqualKeys(max +1);
        Integer[] lowerKeys = countLowerKeys(equalKeys, max+1);
        Integer[] tabB = reOrganize(lowerKeys, max +1);
    }

    /* Sortowanie przez zliczanie częśc główna*/
    private static Integer[] reOrganize(Integer[] lowerKeys, int max)
    {
        int i,j,key,index;
        Integer[] nextTab = new Integer[max];
        Integer[] tabB = new Integer[tabA.length];
       for (j = 0; j < max +1; j++)
       {
           nextTab[j] = lowerKeys[j] + 1;
           for (i = 0; i < tabA.length; i++)
           {
              key = tabA[i];
              index = nextTab[key];
           }
       }
    }

    /* Tworzenie tablicy, która zbiera informacje o ilości równych kluczy */
    private static Integer[] countEqualKeys(int max)
    {
        int key;
        Integer[] equalTab = new Integer[max];
        Arrays.fill(equalTab,0);
        for (int i = 0; i < tabA.length; i++)
        {
            key = tabA[i];
            equalTab[key]++;
        }
        return equalTab;
    }

    /* Tworzenie tablicy, która zbiera informacje o ilości mniejszych kluczy */
    private static Integer[] countLowerKeys(Integer[] equalKeys, int max)
    {
        Integer[] lowerTab = new Integer[max];
        Arrays.fill(lowerTab, 0);
        for (int i = 1; i < max +1; i++)
        {
            lowerTab[i] = lowerTab[i-1] + equalKeys[i-1];
        }
        return lowerTab;
    }

    /* Określa przedział wartości w tabliy poczatkowej */
    private static int findMax(Integer tab[])
    {
        int max = tab[0];
        for (int i =0; i < tab.length; i++)
        {
            if (tab[i] > max)
            {
                max = tab[i];
            }
        }
        return max;
    }

}
