package org.sort;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * packageName : org.sort
 * fileName : KthNumber
 * author : PC
 * date : 2024-07-03
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-07-03         PC          최초 생성
 */
public class KthNumber {
    public static void main(String[] args) {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        solution(array,commands);
    }
    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = {};
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < commands.length; i++) {
            ArrayList<Integer> list = new ArrayList<>();
            for (int j = commands[i][0]-1; j < commands[i][1]; j++) {
                list.add(array[j]);
            }
            list.sort(Comparator.naturalOrder()); // 오름차순
//            list.sort(Comparator.reverseOrder()); // 내림차순은 reverseOrder
            result.add(list.get(commands[i][2]-1));
        }
        System.out.println(result);
        answer = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }
        return answer;
    }
}

