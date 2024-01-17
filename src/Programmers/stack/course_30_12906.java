package Programmers.stack;

import java.util.Stack;

public class course_30_12906 {

	/** 스택 문제
	 * /learn/courses/30/lessons/12906
	 * */
	public static void main(String[] args) {

		int[] arr = {1,1,3,3,0,1,1};

		Stack<Integer> stack = new Stack<Integer>();

		stack.push(arr[0] );


		for(int i=1 ; i<arr.length ; i++){

			if(stack.peek()!=arr[i]  ){
				stack.push(arr[i]);
			}

		}
		int[] a = stack.stream().mapToInt(Integer::intValue).toArray();




	}

}
