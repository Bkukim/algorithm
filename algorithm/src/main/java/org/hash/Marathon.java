package org.hash;

import java.util.HashMap;

/**
 * packageName : org.hash
 * fileName : Marathon
 * author : PC
 * date : 2024-06-30
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-06-30         PC          최초 생성
 */
public class Marathon {

    // todo 해쉬는 문자열 정보를 기록하고 관리하려면 단순배열을 슬 수 없어 키와 값의 형태인 hash를 사용해서 숫자화 시키거나 boolean화시켜 관리가 쉬워진다.

    // todo 이 문제에서 map 의 자료형을 boolean 을 사용하면 안되는 이유
    // 처음엔 boolean 으로 했는데 이렇게 하면 중복된 사람을 걸러 낼 수가 없다.
    // 그래서 int 로 아예 참가자의 수를 세버리면 중복된 사람도 체크가 가능!
    public static void main(String[] args) {
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};
        String answer = solution(participant,completion);
        System.out.println(answer);
    }
    public static String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String,Integer> map = new HashMap<>();
        for (String player : participant) {
            map.put(player,map.getOrDefault(player,0)+1); // getOrDefault(키,키가 null 일 경우 반환할 값)
        }
        for (String finisher : completion) {
            map.put(finisher, map.get(finisher)-1);
        }
        for (String unFinisher : map.keySet()) {
            if (map.get(unFinisher) == 1) {
                answer = unFinisher;
                break;
            }

        }
        return answer;

    }
}
