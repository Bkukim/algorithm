package org.array;

import java.util.Arrays;

/**
 * packageName : org.array
 * fileName : LargestNumber
 * author : PC
 * date : 2024-09-09
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-09-09         PC          최초 생성
 */
public class LargestNumber {
    public String solution(int[] numbers) {
        StringBuilder answer = new StringBuilder();
        String[] arr = new String[numbers.length];
         for (int i = 0; i < numbers.length; i++) {
            arr[i] = String.valueOf(numbers[i]);
        }
         Arrays.sort(arr,((o1, o2) -> (o2+o1).compareTo(o1+o2)));
        if (arr[0].equals("0")){
            return "0";
        }

        for (int i = 0; i < arr.length; i++) {

            answer.append(arr[i]);
        }
        return answer.toString();
    }
}
