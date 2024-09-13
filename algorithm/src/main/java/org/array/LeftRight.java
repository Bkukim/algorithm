package org.array;

import java.util.ArrayList;
import java.util.List;

/**
 * packageName : org.array
 * fileName : LeftRight
 * author : PC
 * date : 2024-08-23
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-08-23         PC          최초 생성
 */
public class LeftRight {
    public String[] solution(String[] str_list) {
        String[] answer = {};
        List<String> list = new ArrayList<>();
        for (int i = 0; i < str_list.length; i++) {
            // 아니 또 뭐가 문제냐고 ....
            if (str_list[i].equals("l")) {
                if (i == 0) {
                    return answer;
                }
                for (int j = 0; j < i; j++) {
                    list.add(str_list[j]);
                }
                answer = new String[list.size()];
                for (int j = 0; j < list.size(); j++) {

                    answer[j] = list.get(j);
                }
                return answer;
            }
            if (str_list[i].equals("r")) {
                if (i == str_list.length-1) {
                    return answer;
                }
                for (int j = i+1; j < str_list.length; j++) {
                    list.add(str_list[j]);
                }
                answer = new String[list.size()];
                for (int j = 0; j < list.size(); j++) {
                    answer[j] = list.get(j);
                }
                return answer;

            }
        }
        return answer;
    }
}
