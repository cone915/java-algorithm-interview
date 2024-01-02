package main.java.chap06._1;

public class ValidPalindrome2_1 {

    public boolean isPalindrome(String s) {
        String s_filtered = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String s_reversed = new StringBuilder(s_filtered).reverse().toString();
        return s_filtered.equals(s_reversed);
    }
}
