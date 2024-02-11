package baekjoon.추천_문제_풀이.part1;

/*
0 32
3 13
28 25
17 5
21 20
11 0
12 12
4 2
0 8
21 0

42
10개의 역에 대해 기차에서 내린 사람 수와 탄 사람 수가 주어졌을 때, 기차에 사람이 가장 많을 때의 사람 수를 계산하는 프로그램을 작성하시오.

*/

import java.util.Scanner;

public class baek_2460 {

	public static void main(String[] args) {

		int sum=0;
		int max=0;
		Scanner sc = new Scanner(System.in);

		for(int i=0 ; i<10 ; i++){

			int n,m;
			n = sc.nextInt();
			m = sc.nextInt();

			sum = sum -n;
			sum = sum +m;

			if(sum>max){

				max =sum;
			}
		}


		System.out.println(max);

	}

}
