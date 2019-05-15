package Beginning;

public class ArraySum {

    public static void main(String[] args) {

        Integer[] array = new Integer[]{4,5,7,10,15,19,224};
        int result = 0;
        for (int i =0; i < array.length; i++)
        {
            result += array[i];
        }

        System.out.println("Suma wszystkich elementow tablicy wynosi: " + result);

    }
}
