package Programmers.hashMap;

import java.util.Arrays;
import java.util.HashMap;

public class course_30_42576 {
	//https://school.programmers.co.kr/learn/courses/30/lessons/42576
	public  static void main(String[] args) {

		String[] p = {"mislav", "stanko", "mislav", "ana"};
		String[] c = {"stanko", "ana", "mislav"};


		System.out.println(solution(p,c));
	}


	private static String solution(String[] participant, String[] completion) {
			String answer = "";

			HashMap<String,String> map = new HashMap();

			for(String p : participant){

				if(! Arrays.stream(completion).anyMatch(p::equals)){
					answer = p;

				}
			}


			return answer;
		}
	}

