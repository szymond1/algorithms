package Beginning;

import java.io.Console;
import java.util.Scanner;

public class Szukanie_Wartownik {

    private static int a[];

    public static void main(String[] args) {
        int i, n, x;

        //pobierz dane od uzytkownika
        System.out.println("Podaj liczbe elementow tablicy");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        a = new int[n+1];
        for (i=0; i<n; i++) {
            System.out.println("Podaj element a[" + i +"]");
            a[i] = scanner.nextInt();
        }
        System.out.println("Podaj element do wyszukania");
        x = scanner.nextInt();

        //szukaj elementu x
        a[n] = x;
        i = 0;
        while (a[i] != x) {
            i++;
        }

        //podaj wynik
        if (i == n)
            System.out.println("Nieznaleziono w tablicy elementu " + x);
        else
            System.out.println("Odnaleziono element "+x+" pod indeksem "+i);

    }
}
