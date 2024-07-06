package org.array;


import java.util.ArrayList;
import java.util.List;

/**
 * packageName : org.array
 * fileName : MakingArray
 * author : PC
 * date : 2024-07-06
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-07-06         PC          최초 생성
 */
public class MakingArray {
    public static void main(String[] args) {
        int l = 5;
        int r = 555;
        solution(l, r);
    }

    public static int[] solution(int l, int r) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        int maxDigit = String.valueOf(r).length();
        int maxNum = (int) Math.pow(2.0, maxDigit);
        for (int i = 0; i < maxNum; i++) {
            String binaryString = Integer.toBinaryString(i);
            int target = Integer.parseInt(binaryString) * 5;
            if (target >= l && target <= r) {
                list.add(target);
            }
        }
        if (list.isEmpty()) {
            answer = new int[1];
            answer[0] = -1;
        }else {
            answer = new int[list.size()];
            for (int i = 0; i < list.size(); i++) {
                answer[i] = list.get(i);
            }
        }

        return answer;

    }
//    public static int[] solution(int l, int r) {
//        int[] answer = {};
//        ArrayList<Integer> list = new ArrayList<>();
//        for (int i = l; i < r + 1; i++) {
//            list.add(i);
//        }
////        System.out.println(list);
//        int a = list.size();
//        for (int i = 0; i < a; i++) {
//            String strNum = String.valueOf(list.get(i));
//            String[] strArr = strNum.split("");
//            for (int j = 0; j < strArr.length; j++) {
//                if (strArr[j].equals("0") || strArr[j].equals("5")) {
//
//                }else {
//                    list.set(i,0);
//                    break;
//                }
//            }
//            if (strArr == null) {
//
//            }
//        }
//        HashSet<Integer> set = new HashSet<>(list);
//        list = new ArrayList<>(set);
//        list.sort(Comparator.naturalOrder());
//        for (int i = 0; i < list.size(); i++) {
//            if (list.get(i) == 0) {
//                list.remove(i);
//                break;
//            }
//        }
//        if (list.isEmpty()) {
//            answer = new int[1];
//            answer[0] = -1;
//        }else {
//            answer = new int[list.size()];
//            for (int i = 0; i < answer.length; i++) {
//                answer[i] = list.get(i);
//            }
//        }
//
//        return answer;
//    }
}
