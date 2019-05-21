package Beginning;

import java.util.Scanner;

public class LowerUpperCase {

    public static void main(String[] args) {

        System.out.println("Podaj tekst do przetworzenia...");
        Scanner scanner = new Scanner(System.in);
        String inputText = scanner.nextLine();
        String result = "";
        int index = 0;

        char[] array = inputText.toCharArray();
        for (char c : array)
        {
            if (index % 2 == 0)
            {
                result +=  String.valueOf(c).toLowerCase();
            } else {
                result +=  String.valueOf(c).toUpperCase();
            }
            index++;
        }

        System.out.println(result);

    }
}
