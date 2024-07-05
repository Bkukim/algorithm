package org.loop;

import java.util.ArrayList;
import java.util.List;

/**
 * packageName : org.loop
 * fileName : ColatzSequence
 * author : PC
 * date : 2024-07-04
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-07-04         PC          최초 생성
 */
public class ColatzSequence {
    public static void main(String[] args) {

    }
    public int[] solution(int n) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        list.add(n);
        while (n != 1){
            if (n % 2 == 0) {
                n /= 2;
            }else {
                n = 3*n+1;
            }
            list.add(n);
        }
        answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}
