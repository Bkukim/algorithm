package org.hash;

import java.util.*;

/**
 * packageName : org.hash
 * fileName : BestAlbeom
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
public class BestAlbum {
    public static void main(String[] args) {
        String[] genres ={"classic", "pop", "classic", "classic", "pop"};
        int[] plays ={500, 600, 150, 800, 2500};
        solution(genres,plays);
    }
    public static int[] solution(String[] genres, int[] plays) {
        int[] answer = {};
        int max = 0;
        String maxGenre = "";
        HashMap<String,Integer> genresAndPlays = new HashMap<>();
        TreeMap<Integer,String>  playsAndGenres = new TreeMap<>();// treemap 은 키 기준으로 자동 정렬되고 시간복잡도도 logN임


        ArrayList<Integer> result = new ArrayList<>();

        // 가장 많이 들은 장르 정하기
        for (int i = 0; i < genres.length; i++) {
            genresAndPlays.put(genres[i],genresAndPlays.getOrDefault(genres[i],0)+plays[i]);
        }
        // 플레이 순으로 장르 정렬하기
        for (String genre : genresAndPlays.keySet()) {
            playsAndGenres.put(genresAndPlays.get(genre),genre);
        }
        System.out.println(playsAndGenres);
        for (Integer play : playsAndGenres.keySet()) {
            TreeMap<Integer,Integer>  playsAndI = new TreeMap<>();
            for (int i = genres.length-1; i > -1; i--) { // 역순으로 해야 중복시 i 가 적은 것이 들어감
                // 플레이순으로 가져온 장르와 원래 장르가 같으면 그 i 의 play 를 키로 하여 treemap 에 담는다. 이때 play 가 중복되면 원래 i 밸류가 되야한다.
                if (playsAndGenres.get(play).equals(genres[i])) {
                    playsAndI.put(plays[i],i);
                }
            }
            result.add(0,playsAndI.get(playsAndI.lastKey())); // 가장 큰 i를 배열에 넣기
            playsAndI.remove(playsAndI.lastKey()); // 가장 큰 i 삭제
            result.add(1,playsAndI.get(playsAndI.lastKey())); // 두번째 큰 i를 배열에 넣기
            playsAndI.remove(playsAndI.lastKey());
        }
        System.out.println(result);
        answer = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }

        return answer;
    }
}
