package Programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class course_30_120880 {

	//특이한 정렬
	//https://school.programmers.co.kr/learn/courses/30/lessons/120880#qna
	public  static void main(String[] args) {

		int[] numlist = {1, 2, 3, 4, 5, 6};
		int n = 4;

		List<Integer> nums = new ArrayList<>();
		Arrays.sort(numlist);
		for (int num : numlist) nums.add(num);

		nums.stream().forEach(x-> System.out.print(x + " "));

		System.out.println();

		nums.sort((s1, s2)->  -(Integer.compare(Math.abs(s2 - n), Math.abs(s1 - n))));

		nums.stream().forEach(x-> System.out.print(x + " "));

	}
}
