package baekjoon.추천_문제_풀이.part1;

import java.util.Scanner;

public class baek_10870_피보나치 {
	public static void main(String[] args) {

		int n;
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();

		System.out.println(fibonacci(n));

	}

	private static int fibonacci(int i) {
		if (i == 0) {
			return 0;
		}else if(i == 1){

			return  1;
		}else {

			return fibonacci(i-1) + fibonacci(i-2) ;
		}

	}

}
