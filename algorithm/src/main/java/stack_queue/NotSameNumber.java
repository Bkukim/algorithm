package stack_queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * packageName : stack_queue
 * fileName : NotSameNumber
 * author : PC
 * date : 2024-07-02
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-07-02         PC          최초 생성
 */
public class NotSameNumber {
    public static void main(String[] args) {
        int[] arr = {1,1,3,3,0,1,1};
        for (int i = 0; i < solution(arr).length; i++) {
            System.out.println(solution(arr)[i]);
        }
    }
    public static int[] solution(int[] arr) {
        int[] answer = {};
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            if (!stack.isEmpty() && stack.peek() != arr[i]) {
                stack.push(arr[i]);
            } else if (stack.isEmpty()) {
                stack.push(arr[i]);
            }
        }
        answer = new int[stack.size()];
        for (int i = stack.size()-1; i > -1; i--) {
            answer[i] = stack.pop();
        }
        return answer;
    }

}
