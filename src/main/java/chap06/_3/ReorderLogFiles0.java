package main.java.chap06._3;

import java.util.*;

public class ReorderLogFiles0 {
    /*
    로그를 재정렬 하라. 기준은 다음과 같다.
    1. 로그의 가장 앞부분은 식발자로서, 순서에 영향을 끼치지 않는다.
    2. 문자로 구성된 로그가 숫자 로그보다 앞에 오묘, 문자 로그는 사전순으로 한다.
    3. 문자가 동일할 경우에는 식별자순으로 한다.
    4.숫자 로그는 입력 순서대로 한다.
     */
    public String[] reorderLogFiles(String[] logs) {
        //문자와 숫자 판별하고 구분한 뒤, 문자별 숫자별 정렬후 다시합침

        //문자 로그를 저장할 문자 리스트
        List<String> letterList = new ArrayList<>();
        //숫자 로그를 저장할 문자 리스트
        List<String> digitList = new ArrayList<>();

        for (String log : logs) {
            if (Character.isDigit(log.split(" ")[1].charAt(0))) { // 숫자로그일때
                digitList.add(log); //숫자로그 저장하는 문자 리스트에 저장
            } else {
                letterList.add(log); // 숫자로그아니므로 문자로그 저장하는 문자 리스트에 저장
            }
        }
        //숫자는 입력순 정렬
        //문자 리스트 정렬 진행 ( 사전순 )
        Collections.sort(letterList, new Comparator<String>() { // sort에 Comparator이용하면 정렬조건 설정하고 정렬할 수 있다
            @Override // compare오버라이딩해서 정렬조건 설정?
            public int compare(String s1, String s2) { // "id2 art can"
                String[] s1x = s1.split(" ", 2); // ["id2" , "art can"]
                String[] s2x = s2.split(" ", 2);

                int compared = s1x[1].compareTo(s2x[1]);
                if (compared == 0) { // 식별자 외 문자 완전 일치?
                    // str1.compareTo(str2) --> 동일하면 0 / str2(비교대상)가 앞에와야한다면 1 / str2가 뒤에와야 한다면 -1
                    return s1x[0].compareTo(s2x[0]); // 식별자로 정렬
                } else {
                    return compared; // 1 or -1
                }
            }
        });

        //문자 리스트 뒤로 숫자 리스트 이어 붙인다.
        // 숫자 로그는 '입력 순서대로' 라는 제약 조건이 있으므로 따로 정렬하지 않는다.
        letterList.addAll(digitList);

        //리스트를 String 배열로 변환해 리턴한다.
        return letterList.toArray(new String[0]);
    }
}




