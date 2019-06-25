package String;

public class ZamianaNapisuNaInny {
    private static String textX = "ATGATCGGCAT";
    private static String textY = "CAATGTGAATC";

    static int[][] cost = new int[textX.length()+ 1][textY.length() +1];
    static String[][] op = new String[textX.length()+ 1][textY.length() +1];

    public static void main(String[] args) {

        levenshtein();
        String sub = levenshtienSubstring(op, textX.length() ,textY.length());

        System.out.println(sub);
    }

    // odległości Levenshteina. Najmniejsza liczba działań prostych, przeprowadzająca jeden napis w drugi.
    private static void levenshtein() {
        int cc = -1; // cost of copy
        int cr = 1; // cost of replace
        int cd = 2; // cost of delete
        int ci =2; // cost of insert
        int i,j;


        for(i =1;i < textX.length() +1; i++)
        {
            cost[i][0] = cd * i;
            op[i][0] = "usun "+ String.valueOf(textX.charAt(i-1));
        }
        for(j=1; j<textY.length()+1;j++)
        {
            cost[0][j] = ci * j;
            op[0][j] = "wstaw " + String.valueOf(textY.charAt(j-1));
        }


        for (i = 1; i < textX.length()+1; i++)
        {
            for (j=1; j<textY.length()+1; j++)
            {
                if (textX.charAt(i-1) == textY.charAt(j-1))
                {
                    cost[i][j] = cost[i-1][j-1] + cc;
                    op[i][j] =  "kopiuj " + String.valueOf(textX.charAt(i-1));
                } else {
                    cost[i][j] = cost[i-1][j-1] + cr;
                    op[i][j] =  "zastap " + String.valueOf(textX.charAt(i-1)) + " przez " + String.valueOf(textY.charAt(j-1));
                }

                if(cost[i-1][j] + cd < cost[i][j])
                {
                    cost[i][j] = cost[i-1][j] + cd;
                    op[i][j] =  "usun " + String.valueOf(textX.charAt(i-1));
                }

                if(cost[i][j-1] + ci < cost[i][j])
                {
                    cost[i][j] = cost[i][j-1] + ci;
                    op[i][j] =  "wstaw " + String.valueOf(textY.charAt(j-1));
                }
            }
        }
        // wynikiem jest minimalny koszt operacji - cost[i][j]
    }

    //wypisanie krok po kroku operacji jakie trzeba wykonac
    public static String levenshtienSubstring(String[][] op, int i, int j)
    {
        if (i == 0 && j ==0)
        {
            return "";
        }
        if (op[i][j].startsWith("k") || op[i][j].startsWith("z"))
        {
            return levenshtienSubstring(op,i-1,j-1) + ", " + op[i][j];
        } else if (op[i][j].startsWith("u")) {
            return levenshtienSubstring(op,i-1,j) + ", " + op[i][j];
        } else {
            return levenshtienSubstring(op,i,j-1) + ", " + op[i][j];
        }
    }


}
