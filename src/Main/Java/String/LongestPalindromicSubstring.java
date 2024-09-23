package Main.Java.String;

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        String input = "babad";
        System.out.println("Longest Palindromic Substring: " + longestPalindrome(input));
    }

    public static String longestPalindrome(String s) {
        if (s == null || s.length() < 2) {
            return s;
        }

        int start = 0, maxLength = 1;
        int length = s.length();

        boolean[][] dp = new boolean[length][length];

        for (int i = 0; i < length; i++) {
            dp[i][i] = true;
        }

        for (int end = 1; end < length; end++) {
            for (int begin = 0; begin < end; begin++) {
                if (s.charAt(begin) == s.charAt(end) && (end - begin <= 2 || dp[begin + 1][end - 1])) {
                    dp[begin][end] = true;

                    if (end - begin + 1 > maxLength) {
                        start = begin;
                        maxLength = end - begin + 1;
                    }
                }
            }
        }

        return s.substring(start, start + maxLength);
    }
}
