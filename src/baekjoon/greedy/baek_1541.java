package baekjoon.greedy;

/*
55-50+40
 */

//수식에 괄호를 입력해서 가장 작은 수 구하기

import java.util.Scanner;

public class baek_1541 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		int answer = 0;

		String[] splitArray = input.split("-");

		for(int i =0 ; i< splitArray.length ; i++){

			int temp =  mySum(splitArray[i]);

			if(i==0){
				answer = answer+temp;
			}else{
				answer = answer-temp;
			}
		}
		System.out.println(answer);
	}

	private static int mySum(String input) {
		int sum=0;

		String[] splitArray = input.split("[+]");
		for(String s : splitArray){

			sum = sum + Integer.parseInt(s);
		}
		return  sum;
	}

}
