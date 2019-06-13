package String;

public class LongestCommonSubsequence {

    private static String textX = "CATCGA";
    private static String textY = "GTACCGTCA";
    private static int[][] l = new int[textX.length()+ 1][textY.length() +1];

    public static void main(String[] args) {

        int[][] lengthLcs = countLenghtLCS(l);
        int u = textX.length();
        int w = textY.length();
        String LCS = findLCS(lengthLcs,u,w);
        System.out.println("Najdłuzszy wspólny podciąg to: " + LCS);
    }

    // Obliczamy długość najdłuższego wspólnego podciągu(l[textX.length()+ 1][textY.length() +1])
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
                } else {

                    result = (l[i][j-1] >= l[i-1][j]) ? l[i][j-1] : l[i-1][j];
                    l[i][j] = result;
                }
            }
        }
        return l;
    }

    private static String findLCS(int[][] lcs,int u, int w)
    {
        int i = u;
        int j = w;

        if (lcs[i][j] == 0)
        {
            return "";
        }

        if (textX.charAt(i-1) == textY.charAt(j-1))
        {
            return findLCS(lcs, i-1, j-1) + textX.charAt(i-1);
        } else {
            if (l[i][j-1] > l[i-1][j])
            {
                return findLCS(lcs,i,j-1);
            } else {
                return findLCS(lcs,i-1,j);
            }
        }

    }


}
