package main.java.chap06._1;

public class ValidPalindromeMain {

    public static void main(String[] args) {
        String s = "cA bba?C!!";
        String d = "Do geese see God?";

        System.out.println("validPalindrome0 result");
        ValidPalindrome1_0 validPalindrome0 = new ValidPalindrome1_0();
        System.out.println(validPalindrome0.isPalindrome(s));
        System.out.println(validPalindrome0.isPalindrome(d));

        System.out.println("validPalindrome1 result");
        ValidPalindrome1_1 validPalindrome1 = new ValidPalindrome1_1();
        System.out.println(validPalindrome1.isPalindrome(s));
        System.out.println(validPalindrome1.isPalindrome(d));

//        System.out.println(new StringBuilder("dog").reverse().toString());
//        System.out.println(s.replaceAll("[^A-Za-z0-9]", ""));

        System.out.println("validPalindrome2 result");
        ValidPalindrome2_0 validPalindrome2 = new ValidPalindrome2_0();
        System.out.println(validPalindrome2.isPalindrome(s));
        System.out.println(validPalindrome2.isPalindrome(d));

        System.out.println("validPalindrome3 result");
        ValidPalindrome2_1 validPalindrome3 = new ValidPalindrome2_1();
        System.out.println(validPalindrome3.isPalindrome(s));
        System.out.println(validPalindrome3.isPalindrome(d));
    }
}
