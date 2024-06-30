package org.hash;

import java.util.HashSet;

/**
 * packageName : org.hash
 * fileName : Pocketmon
 * author : PC
 * date : 2024-06-30
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-06-30         PC          최초 생성
 */
public class PocketMon {
    public static void main(String[] args) {
        int[] nums = {3,1,2,3};
        int answer = solution(nums);
        System.out.println(answer);
    }
    public static int solution(int[] nums) {
        int answer = 0;
        int mine = nums.length/2;
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            hashSet.add(nums[i]);
        }
        if (hashSet.size() >= mine) {
            answer = mine;
        }else{
            answer = hashSet.size();

        }
        return answer;
    }
}
