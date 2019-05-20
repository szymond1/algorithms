package Beginning;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

    //Szukanie polówkowe (binarne)
    // Załóżmy że mamy daną tablicę n-elementów i chcemy odnaleźć w niej zadany element x.
    // Niech będzie to tablica a o indeksach od 1 do n.
    // Czyli kolejne jej elementy oznaczymy: a[1], a[2], a[3], ..., a[n-1], a[n].

    public static void main(String[] args) {

        Integer[] array = new Integer[]{15,5,17,22,33,19,7,51,43};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj element do wyszukania");
        int x = scanner.nextInt();

        Arrays.sort(array);
        System.out.println(Arrays.asList(array));
        int l = 0;
        int p = array.length - 1;
        int s;

        if (array[l] > array[p])
        {
            System.out.println("Nie odnaleziono elementu o wartości: " + x);
        } else {
            while(l <= p)
            {
                s = (l+p)/2;
                if (array[s] == x)
                {
                    System.out.println("Element " + x + " jest na " + (s +1)  + " miejscu tablicy");
                    return;
                }
                if (array[s] < x)
                    l = s +1;
                 else
                    p = s - 1;

            }
            System.out.println("Nie odnaleziono elementu o wartości: " + x);
        }

    }
}
