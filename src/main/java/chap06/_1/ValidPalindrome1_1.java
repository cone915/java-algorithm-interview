package main.java.chap06._1;

public class ValidPalindrome1_1 {
    // 주어진 문자열이 팰린드롬(문자열 앞뒤 대칭)인지 확인하라. 대소문자 구분하지 않으며, 영숫자(영문자와 숫자)만을 대상으로 한다
    // "Do geese see God?"
    // 먼저, 영숫자 아닌것 잘라내고 앞뒤 소문자나 대문자로 통일해서 비교해서 검증
    public boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1; // 인덱스시작은0
        while (start < end) {
            if (!Character.isLetterOrDigit(s.charAt(start))) {
                start++;
            } else if (!Character.isLetterOrDigit(s.charAt(end))) {
                end--;
            } else {
                if (Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end))) {
                    return false;
                }
                //검증완료후 각각 뒤로 앞으로 하나씩 이동
                start++;
                end--;
            }
        }
        return true;
    }
}
