package String;

public class LongestCommonSubstring {

    private static String textX = "zxabcdezy";
    private static String textY = "yzabcdezx";
    private static int[][] l = new int[textX.length()+ 1][textY.length() +1];

    public static void main(String[] args) {

        int[][] lengthLcs = countLenghtLCS(l);
        int[] answerArray = findMaximumIndex(lengthLcs);

        String LCS = textX.substring(answerArray[0]-answerArray[2], answerArray[0]);
        System.out.println("Najdłuzszy wspólny podwyraz to: " + LCS);
    }

    // Obliczamy długość najdłuższego wspólnego podwyrazu(l[textX.length()+ 1][textY.length() +1])
    private static int[][] countLenghtLCS(int[][] l) {
        int i,j;
        Integer result;
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
