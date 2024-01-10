package Programmers.hashMap;

import java.util.HashMap;

public class course_30_178871 {

	/** 달리기 경주
	 * https://school.programmers.co.kr/learn/courses/30/lessons/178871
	 * calling 하면 앞 선수 추월,
	 * 등부터 등수 순서대로 배열에 담아 return
	 * */
	public static void main(String[] args) {

		String[] players = {"mumu", "soe", "poe", "kai", "mine"};
		String[] callings = {"kai", "kai", "mine", "mine"};

		String[] answer = new String[players.length];

		//이름, 랭크
		HashMap<String, Integer> mappedByPlayer = new HashMap<>();
		//랭크, 이름
		HashMap<Integer, String> mappedByRank = new HashMap<>();

		// 각각의 맵을 초기화
		for (int i = 0; i < players.length; i++) {
			mappedByPlayer.put(players[i], i);
			mappedByRank.put(i, players[i]);
		}

		for (int i = 0; i < callings.length; i++) {

			int currentRank  = mappedByPlayer.get(callings[i]);
			String player = mappedByRank.get(currentRank);

			String frontPlayer = mappedByRank.get(currentRank-1);

			//swap
			mappedByPlayer.put(player, currentRank - 1);
			mappedByPlayer.put(frontPlayer, currentRank);

			mappedByRank.put(currentRank - 1, player);
			mappedByRank.put(currentRank, frontPlayer);

			for (int j = 0; j < players.length; j++) {
				answer[i] = mappedByRank.get(j);
			}




		}
		for(String anw : answer){

			System.out.println(anw);

		}

	}

}
