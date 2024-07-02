package org.hash;

import java.util.HashMap;
import java.util.HashSet;

/**
 * packageName : org.hash
 * fileName : PhoneBook
 * author : PC
 * date : 2024-07-01
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-07-01         PC          최초 생성
 */
public class PhoneBook {
    public static void main(String[] args) {
        String[] phone_book = {"119", "97674223", "1195524421"};

    }
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        HashMap<String,Integer> map = new HashMap<>();
        for (String num : phone_book) {
            map.put(num,0);
        }
        for (String num : phone_book) {
            for (int i = 0; i < num.length(); i++) {
                if (map.containsKey(num.substring(0,i))) { // substring 은 i를 포함하지 않음 그래서 num 이 119 이면 11까지만 채취
                    return false;
                }
            }
        }
        return answer;
    }
}
