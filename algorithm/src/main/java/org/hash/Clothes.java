package org.hash;

import java.util.HashMap;

/**
 * packageName : org.hash
 * fileName : Clothes
 * author : PC
 * date : 2024-07-01
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-07-01         PC          최초 생성
 */
public class Clothes {
    public int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String,Integer> map = new HashMap<>();
        for (int i = 0; i < clothes.length; i++) {
            map.put(clothes[i][1],map.getOrDefault(clothes[i][1],0)+1);
        }
        for(String key : map.keySet()) {
            answer *= (map.get(key) + 1);   // 안 입는 경우의 수를 포함시켜서 다곱해버리면 됨
        }
        answer =- 1; // 모두 안 입는 경우의수가 생기기 때문에 1 없애주기
        return answer;
    }
}
