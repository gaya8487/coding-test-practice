package baekjoon.추천_문제_풀이.part1;

import java.util.Scanner;

/*
24 18

6
72
첫째 줄에는 입력으로 주어진 두 수의 최대공약수를,
둘째 줄에는 입력으로 주어진 두 수의 최소 공배수를 출력한다.
*/
public class baek_2609 {
	public static void main(String[] args) {

		int n,m;
		int result1;
		int result2;

		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		m = sc.nextInt();

		result1 =gcd(n,m);
		System.out.println(result1);

		result2 =n*m/gcd(n,m);
		System.out.println(result2);

	}

	static int gcd(int a, int b){

		if(b==0) return a;
		return gcd(b,a%b);
	}
}
