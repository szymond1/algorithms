package Beginning;


import java.util.Arrays;

public class MedianaDominanta {

    private static int liczby[] = { 1, 2, 3, 4, 4, 4, 4, 5, 6, 7, 8, 13, 13,
            13, 13, 13, 9, 10, 100, 1 };

    public static void main(String args[]) {

        mediana();
        dominanta();

    }

    private static void mediana() {
        double mediana = 0;
        Arrays.sort(liczby);
        if (liczby.length % 2 == 0) {
            mediana = (liczby[liczby.length / 2] + liczby[(liczby.length / 2) + 1]) / 2.0;
        } else {
            mediana = liczby[liczby.length / 2];
        }

        System.out.println("Mediana liczb w tablicy to: " + mediana);
    }

    private static void dominanta() {
        int dominanta = 0;
        int maks = 0;
        int licznik = 0;

        for (int i = 0; i < liczby.length; i++) {
            licznik = 0;
            for (int k = 0; k < liczby.length; k++) {
                if (liczby[i] == liczby[k]) {
                    licznik++;
                    if (licznik > maks) {
                        dominanta = liczby[i];
                        maks = licznik;
                    }
                }

            }
        }
        System.out.println("Dominanta liczb w tablicy to: " + dominanta);
    }

}
