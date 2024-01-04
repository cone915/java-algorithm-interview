package main.java.chap06._3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ReorderLogFiles1 {

    public String[] reorderLogFiles(String[] logs) {
        ArrayList<String> letterList = new ArrayList<>();
        ArrayList<String> digitList = new ArrayList<>();

        // 숫자 로그 & 문자 로그 분리
        for (String log : logs) {
            if (Character.isDigit(log.split(" ")[1].charAt(0))) {
                digitList.add(log);
            } else {
                letterList.add(log);
            }
        }

        // 문자 로그 정렬 ( 사전순 -> 문자 같다면 식별자 순 )
        /* #1
        Collections.sort(letterList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String[] s1 = o1.split(" ", 2);
                String[] s2 = o2.split(" ", 2);

                int compared = s1[1].compareTo(s2[1]);
                if (compared == 0) {
                    return s1[0].compareTo(s2[0]);
                } else {
                    return compared;
                }
            }
        });
        */

        /* #2
        Collections.sort(letterList, (s1, s2) -> {
            String[] s1x = s1.split(" ", 2);
            String[] s2x = s2.split(" ", 2);

            int compared = s1x[1].compareTo(s2x[1]);
            if (compared == 0) {
                return s1x[0].compareTo(s2x[0]);
            } else {
                return compared;
            }
        });
        */

//        #3
        letterList.sort((s1, s2) -> {
            String[] s1x = s1.split(" ", 2);
            String[] s2x = s2.split(" ", 2);
            int compared = s1x[1].compareTo(s2x[1]);
            if (compared == 0) {
                return s1x[0].compareTo(s2x[0]);
            } else {
                return compared;
            }
        });


        letterList.addAll(digitList);
        return letterList.toArray(new String[0]);
    }
}
