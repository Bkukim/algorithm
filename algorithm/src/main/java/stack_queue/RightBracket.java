package stack_queue;

import java.util.Stack;

/**
 * packageName : stack_queue
 * fileName : RightBracket
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
public class RightBracket {
    public static void main(String[] args) {
        String s = ")()()";
        solution(s);
    }
    public static boolean solution(String s) {
        boolean answer = true;
        Stack<Integer> stack = new Stack<>();
//        String[] arrS = s.split("");
        char[] arrS = s.toCharArray();
        for (int i = 0; i < arrS.length; i++
        ) {
            if (arrS[i]=='(') {
                stack.push(1);
            }else if(!stack.isEmpty()&&arrS[i]==')') {
                stack.pop();
            }else{
                answer = false;

                return answer;
            }
        }
        if (stack.isEmpty()) {
            answer = true;
        }else {
            answer = false;
        }
        return answer;
    }
}
