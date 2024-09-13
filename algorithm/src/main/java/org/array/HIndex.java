package org.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * packageName : org.array
 * fileName : HIndex
 * author : PC
 * date : 2024-09-12
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-09-12         PC          최초 생성
 */
public class HIndex {
    public static void main(String[] args) {
        int[] citation = {1,3,7,24,6,40,256};
        solution(citation);

    }
    // 이하 숫자와 이하 숫자를 지정
    // if 문으로 반복문을 두번 돌리면서 같으면 둘다 올리고
    public static int solution(int[] citations) {
        int answer = 0;
        Arrays.sort(citations); // 정렬
        for (int i = 0; i < citations.length; i++) {
            int h = citations.length-i;
            if (citations[i]
                    >= h) {
                answer = h;
                break;
            }
        }
        System.out.println(answer);
        return answer;
    }
}
