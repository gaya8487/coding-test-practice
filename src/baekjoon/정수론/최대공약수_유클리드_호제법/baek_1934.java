package baekjoon.정수론.최대공약수_유클리드_호제법;

/*
3
1 45000
6 10
13 17
* */

import java.util.Scanner;

public class baek_1934 {
	public static void main(String[] args) {

		int n;
		int[] inputArray ;
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();

		for(int i=0; i<n ;i++){
			int a = sc.nextInt();
			int b = sc.nextInt();
			int result = a* b/gcd(a,b);

			System.out.println(result);

		}

	}

	static int gcd(int a, int b){

		if (b==0) return  a;

		return gcd(b,a%b);
	}

}
