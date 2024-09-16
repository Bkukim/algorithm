package org.exhaustive_search;

import java.util.ArrayList;
import java.util.List;

/**
 * packageName : org.exhaustive_search
 * fileName : MockExam
 * author : PC
 * date : 2024-09-13
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-09-13         PC          최초 생성
 */
public class MockExam {
    public int[] solution(int[] answers) {
        int[] answer = {};
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] arr3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] score = {0,0,0};
        List<Integer> answerList = new ArrayList<>();

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == arr1[i%5]) score[0]++;
            if (answers[i] == arr2[i%8]) score[1]++;
            if (answers[i] == arr3[i%10]) score[2]++;
        }

        int max = Math.max(score[0],Math.max(score[1],score[2]));
        for (int i = 0; i < 3; i++) {
            if (score[i] == max) answerList.add(i+1);

        }
        answer = new int[answerList.size()];
        for (int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }
        return answer;
    }
}
