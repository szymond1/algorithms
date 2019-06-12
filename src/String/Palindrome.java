package String;

public class Palindrome {

    public static void main(String[] args) {
        String text = "Kobyła ma Mały bok";
        String text1 = text.replaceAll("\\s","").toLowerCase();
        System.out.println(isPalindrome(text1));
        System.out.println(isPalindrom(text1));
    }

    private static boolean isPalindrome(String text) {
        StringBuffer sb = new StringBuffer();
        sb.append(text);
        sb.reverse();
        String result = sb.toString();
        return result.equals(text);
    }

    private static boolean isPalindrom(String text) {
        for (int i=0; i<text.length();i++) {
            if (text.charAt(i) != text.charAt(text.length()-i-1))
            {
                return false;
            }
        }
        return true;
    }
}
