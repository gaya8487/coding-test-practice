package Programmers.exhaustive_search;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.stream.Collectors;

public class course_30_42840 {

	public static void main(String[] args) {
		int[] answers = {1,2,3,4,5};
		solution(answers);
	}
	public static int[] solution(int[] answers) {
		int[] answer = {};

		int s1Count = 0;
		int s2Count =0;
		int s3Count = 0;

		Queue s1 = new LinkedList();
		s1.add(1);
		s1.add(2);
		s1.add(3);
		s1.add(4);
		s1.add(5);

		Queue s2 = new LinkedList();
		s2.add(2);
		s2.add(1);
		s2.add(2);
		s2.add(3);
		s2.add(2);
		s2.add(4);
		s2.add(2);
		s2.add(5);

		Queue s3 = new LinkedList();
		s3.add(3);
		s3.add(3);
		s3.add(1);
		s3.add(1);
		s3.add(2);
		s3.add(2);
		s3.add(4);
		s3.add(4);
		s3.add(5);
		s3.add(5);

		for(int i : answers ){
			int temp1 = (int)s1.poll();
			int temp2 = (int)s2.poll();
			int temp3= (int)s3.poll();
			if(temp1== i){
				s1Count++;
			}
			if(temp2== i){
				s2Count++;
			}
			if(temp3== i){
				s3Count++;
			}
			s1.add(temp1);
			s2.add(temp2);
			s3.add(temp3);
		}

		HashMap<Integer,Integer> countMap = new HashMap<>();
		countMap.put(1,s1Count);
		countMap.put(2,s2Count);
		countMap.put(3,s3Count);


		int max= 0;
		for(int i=1 ; i<=3 ; i++){
			if(countMap.get(i)>max){
				max = countMap.get(i);
			}
		}

		for(int i=1 ; i<=3 ; i++){
			if(countMap.get(i)!=max){
				countMap.remove(i);
			}
		}

		//System.out.println(countMap.keySet());

		List<Integer> list = new ArrayList<>();

		Set<Integer> keySet =  countMap.keySet();
		for(Integer key : keySet){
			list.add(key);
		}

		answer = list.stream().mapToInt(Integer::intValue).toArray();

		for(int a : answer){

			System.out.print(a);
		}

		return answer;
	}

}
