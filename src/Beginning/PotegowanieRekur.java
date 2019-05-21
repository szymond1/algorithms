package Beginning;

import java.util.Scanner;

public class PotegowanieRekur {

    public static int potega(int p, int w) {
        if (w == 0)
            return 1;
        return p * potega(p, --w);
    }

    public static void main(String[] args) {
        int p, w;

        Scanner sc = new Scanner(System.in);
        System.out.print("Podaj podstawe: ");
        p = sc.nextInt();
        System.out.print("Podaj wykladnik: ");
        w = sc.nextInt();

        System.out.println(p + "^" + w + " = " + potega(p,w));
    }

}
