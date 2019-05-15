package Beginning;

import java.util.Scanner;

import static java.lang.Long.parseLong;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj cyfrę aby obliczyć wartość bezwględną");
        Long number = parseLong(scan.next());

        System.out.println("Wartość bezwględna liczby " + number + " wynosi : " + absoluteValue(number));

    }

    public static Long absoluteValue(Long number) {
        if (number >= 0)
        {
            return number;
        } else {
            return -number ;
        }

    }

}
