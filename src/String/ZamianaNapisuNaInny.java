package String;

public class ZamianaNapisuNaInny {

    private static String textX = "ATGATCGGCAT";
    private static String textY = "CAATGTGAATC";


    public static void main(String[] args) {



        System.out.println("Najdłuzszy wspólny podwyraz to: " );
    }

    // odległości Levenshteina. Najmniejsza liczba działań prostych, przeprowadzająca jeden napis w drugi.
    private static int[][] levenshtein(int[][] l) {
        int cc = -1;
        int cr = 1;
        int cd = 2;
        int ci =2;
        int i,j;
        int[][] cost = new int[textX.length()+ 1][textY.length() +1];
        String[][] op = new String[textX.length()+ 1][textY.length() +1];

        for(i =1;i < textX.length(); i++)
        {
            cost[i][0] = cd * i;
            op[i][0] = "usun "+ String.valueOf(textX.charAt(i-1));
        }

        for (i = 1; i < textX.length()+1; i++)
        {
            for (j=1; j<textY.length()+1; j++)
            {
                if (textX.charAt(i-1) == textY.charAt(j-1))
                {
                    l[i][j] = l[i-1][j-1] + 1;
                }
            }
        }
        return l;
    }

    //obliczeanie max indeksu i jego połozenia
    public static int[] findMaximumIndex(int[ ][ ] a)
    {
        int maxVal = 0;
        int[] answerArray = new int[3];
        for(int row = 0; row < a.length; row++)
        {
            for(int col = 0; col < a[row].length; col++)
            {
                if(a[row][col] > maxVal)
                {
                    maxVal = a[row][col];
                    answerArray[0] = row;
                    answerArray[1] = col;
                    answerArray[2] = maxVal;
                }
            }
        }
        return answerArray;
    }


}
