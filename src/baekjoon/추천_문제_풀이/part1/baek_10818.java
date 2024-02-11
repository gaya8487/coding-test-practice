package baekjoon.추천_문제_풀이.part1;

import java.util.Scanner;

public class baek_10818 {

	/*
5
20 10 35 30 7
* */

	public static void main(String[] args) {

		int n;
		int[] m;
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		m = new int[n];

		for(int i=0; i<n ; i++){
			m[i] = sc.nextInt();
		}

		int max,min;

		max = -1000000;
		min =  1000000;

		for(int j: m){
			if(j>max){
				max = j;

			}

			if(j<min){
				min = j;
			}
		}

		System.out.print(min);
		System.out.print(" ");
		System.out.print(max);
	}
}
