package Beginning;

import java.util.Scanner;

public class SumaCyfrLiczby {

    //Do wyliczenia sumy cyfr liczby calkowitej użyjemy
    //dzielenia modulo ( z reszta) 10 i bez reszty z 10
    public static void main(String[] args) {

        System.out.println("Podaj liczbe całkowitą");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int result = 0;

        while (x != 0)
        {
            result += x % 10;
            x = x/ 10;
        }

        System.out.println("Suma cyfr  liczby całkowitej wynosi: " + result);

    }
}
