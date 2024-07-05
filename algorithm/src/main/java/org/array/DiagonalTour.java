package org.array;

import java.util.ArrayList;
import java.util.List;

/**
 * packageName : org.array
 * fileName : DiagonalTour
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
public class DiagonalTour {
    public static void main(String[] args) {

    }
    public int solution(int[][] board, int k) {
        int answer = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (j+i<=k) {
                    answer += board[i][j];
                }
                else {
                    break;
                }
            }
        }
        return answer;
    }
}
