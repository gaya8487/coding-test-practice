package Programmers;

import java.util.HashMap;

public class course_30_181855 {

	public  static void main(String[] args){

	String[] input =  {"a","bc","d","efg","hi"};


		System.out.println(solution(input));

	}


	public static int solution(String[] strArr) {

		int max = 1;

		//Hashmap 생성
		//key: 원소들의 문자열 길이, value:문자열 길이가 key에 해당하는 원소들의 갯수
		HashMap<Integer, Integer> strMap = new HashMap<>();


		//key에 값이 없으면 1 push, 있으면 기존 value 값 갯수 +1 푸쉬
		for(String str : strArr){
			if (strMap.get(str.length())==null) {
				strMap.put(str.length(),1);
			}else{

				strMap.put(str.length(), strMap.get(str.length())+1);
			}
		}

		//value가 가장 큰 값을 찾는다.
		for(Integer key :  strMap.keySet()){

			if(strMap.get(key)>max){
				max = strMap.get(key);
			}


		}


		return max;
	}

}
