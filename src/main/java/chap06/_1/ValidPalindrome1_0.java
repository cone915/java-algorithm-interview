package main.java.chap06._1;

public class ValidPalindrome1_0 {
// 주어진 문자열이 팰린드롬(문자열 앞뒤 대칭)인지 확인하라. 대소문자 구분하지 않으며, 영숫자(영문자와 숫자)만을 대상으로 한다
    // 문자열에서 영숫자 아닌부분 제외? 한다
    public boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;
        //서로 중앙으로 이동해 나가다 겹치는 지점에 도달하면 종료
        while (start < end) {
            //영숫자인지 판별하고 유효하지 않으면 한 칸씩 이동
            if (!Character.isLetterOrDigit(s.charAt(start))) {
                start++;
            } else if (!Character.isLetterOrDigit(s.charAt(end))) {
                end--;
            } else {
                // 유효한 문자라면 (영숫자맞다면), 앞 글자와 뒷 글자 모두 소문자로 변경해서 -> 팰린드롬비교
                if (Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end))) {
                    //하나라도 일치하지 않는다면 팰린드롬 아니므로 false리턴
                    return false;
                }
                // 앞쪽 문자는 한 칸 뒤로, 뒤쪽 문자는 한칸 앞으로 이동
                start++;
                end--;
            }
        }
        //무사히 종료될 경우 팰린드롬 이므로 true 리턴
        return true;
    }
}
