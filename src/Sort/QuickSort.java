package Sort;


public class QuickSort {

    /**
     * Sortowanie liczb calkowitych metoda szybka(quick sort)
     */

    private static Integer tab[] = new Integer[]{9,7,5,11,12,2,14,3,10,6};

    public static void main(String[] args) {
        int i;

        System.out.println("Zbior przed sortowaniem:");
        for (i=0; i<tab.length; i++)
            System.out.print(tab[i] + " ");

        quickSort(0,tab.length-1);

        System.out.println("\nZbior po sortowaniu:");
        for (i=0; i<tab.length; i++)
            System.out.print(tab[i] + " ");

    }

    /* Procedura sortowania tab[pocz...kon] */
    private static void quickSort(int p, int r)
    {
        if (p < r)
        {
        int q = partintioning(p,r);
        quickSort(p,q-1);
        quickSort(q+1,r);
        }
    }

    /* Procedura rozdzielania tablicy */
    private static int partintioning(int p, int r)
    {
        int u,q,x;
        int number = tab[r];
        q = p;
        for (u = p; u <r ; u++)
        {
            if (tab[u] <= number)
            {
                x = tab[q];
                tab[q] = tab[u];
                tab[u] = x;
                q++;
            }
        }
        tab[r] = tab[q];
        tab[q] = number;
        return q;
    }

}
