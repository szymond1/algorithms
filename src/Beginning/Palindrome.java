package algorithms;

public class Palindrome {

    public static void main(String[] args) {
        String text = "madam";
        System.out.println(isPalindrome(text));
        System.out.println(isPalindrom(text));
    }

    public static boolean isPalindrome(String text) {
        StringBuffer sb = new StringBuffer();
        sb.append(text);
        sb.reverse();
        String result = sb.toString();
        return result.equals(text);
    }

    public static boolean isPalindrom(String text) {
        for (int i=0; i<text.length();i++) {
            if (text.charAt(i) == text.charAt(text.length()-i-1));
            return true;
        }
        return false;
    }
}
