package stack_queue;

import java.util.*;

/**
 * packageName : stack_queue
 * fileName : DevelopFunction
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
public class DevelopFunction {

    public static void main(String[] args) {
        int[] progresses = {93, 30, 55};
        int[] speeds = {1, 30, 5};
        solution(progresses,speeds);
    }
    public static int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        Queue<Integer> queue1 = new LinkedList<>();
        Queue<Integer> queue2 = new LinkedList<>();
        Deque<Integer> speedDeque = new ArrayDeque<>();
        ArrayList<Integer> result = new ArrayList<>();
        int count = 0;
        for (int progress : progresses) {
            queue1.add(progress);
        }
        for (int speed : speeds) {
            speedDeque.add(speed);
        }

        while (!queue1.isEmpty()){
            for (int i = 0; i < speedDeque.size(); i++) {
                queue2.add(queue1.poll()+(Integer)speedDeque.toArray()[i]);
            }
            for (int i = 0; i < speedDeque.size(); i++) {
                queue1.add(queue2.poll());
            }
            while (!queue1.isEmpty()&&queue1.peek() >= 100){
                    queue1.poll();
                    speedDeque.poll();
                    count+=1;
            }
            if (count > 0) {
                result.add(count);
                count = 0;
            }

        }
        answer = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }
        return answer;
    }
}
