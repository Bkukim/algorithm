package org.array;

/**
 * packageName : org.array
 * fileName : MakeItSquare
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
public class MakeItSquare {
    public static void main(String[] args) {
//        int[][] arr = {{1, 2}, {3, 4}};
          int[][] arr = {{57, 192, 534, 2}, {9, 345, 192, 999}};
        solution(arr);
    }
    public static int[][] solution(int[][] arr) {
        int[][] answer = {};
        if (arr.length > arr[0].length) {
            answer = new int[arr.length][arr.length];
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    if (j < arr[i].length) {
                        answer[i][j] = arr[i][j];
                    }else {
                        answer[i][j] = 0;
                    }
                }
            }
        } else if (arr[0].length>arr.length) {
            answer = new int[arr[0].length][arr[0].length];
            for (int i = 0; i < arr[0].length; i++) {
                for (int j = 0; j < arr[0].length; j++) {
                    if (i < arr.length) {
                        answer[i][j] = arr[i][j];
                    }else {
                        answer[i][j] = 0;
                    }
                }
            }
        }else{
            answer = new int[arr.length][arr.length];
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                  answer[i][j] = arr[i][j];
                }
            }
        }

        return answer;
    }
}
