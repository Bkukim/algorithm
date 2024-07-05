package org.array;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;

/**
 * packageName : org.array
 * fileName : RandomK
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
public class RandomK {
    public static void main(String[] args) {
        int[] arr = {4,6,5,7,38,9,4,6,8,5,0,5};
        int k = 20;
    }
    public int[] solution(int[] arr, int k) {
        int[] answer = {};
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> list;
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        list = new ArrayList<>(set);
        list.sort(Comparator.naturalOrder());
        answer = new int[k];
        if (list.size() >= k) {
            for (int i = 0; i < k; i++) {
                answer[i] = list.get(i);
            }
        }else {
            for (int i = 0; i < k; i++) {
                if (i < list.size()) {
                    answer[i] = list.get(i);
                }else {
                    answer[i] = -1;
                }
            }
        }
        return answer;
    }
}
