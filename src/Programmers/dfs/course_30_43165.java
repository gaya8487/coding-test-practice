package Programmers.dfs;

public class course_30_43165 {

	static int[] numbers = {1, 1, 1, 1, 1};
	static int target = 3;
	static int answer = 0;

	public static void main(String[] args) {

		//dfs (index,sum)
		dfs(0,0);
		System.out.println(answer);
	}

	private static void dfs(int index, int sum) {

		
		//탈출 조건
		//배열을 다 돌았거나,
		if(index== numbers.length){
			//sum == target 일때
			if(sum==target){
				answer++;
			}
			return;
		}


		
		//수행 조건
		dfs(index+1,sum+numbers[index]);
		dfs(index+1,sum-numbers[index]);


	}

}
