package org.array;

import java.util.ArrayList;
import java.util.List;

/**
 * packageName : org.array
 * fileName : CarvingArray
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
public class CarvingArray {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5,};
        int[] query = {4, 1, 2};
        solution(arr,query);
    }
    public static int[] solution(int[] arr, int[] query) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        for (int i = 0; i < query.length; i++) {
            if (i%2==0) {
               list.subList(query[i]+1, list.size()).clear();
                System.out.println(list);
            }else {
                list.subList(0, query[i]).clear();
                System.out.println(list);
            }
        }
        System.out.println(list);
        answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}
