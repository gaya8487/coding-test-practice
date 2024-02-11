package baekjoon.추천_문제_풀이.part1;

import java.util.Scanner;

/* 6 3*/
//두 개의 자연수 N과 K가 주어졌을 때, N의 약수들 중 K번째로 작은 수를 출력
public class baek_2501 {
	public static void main(String[] args) {

		int n,m;
		int[] array;

		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		m = sc.nextInt();

		int count=0;
		for(int i=1 ; i<=n ;i++){

			if(n%i==0 ){
				count++;
			}

		}

		array = new int[count];

		count=0;
		for(int i=1 ; i<=n ;i++){

			if(n%i==0 ){
				array[count] = i;
				count++;
			}

		}

		//System.out.println(count);

		// for(int i : array){
		// 	System.out.println(i);
		// }

		if(array.length<m){

			System.out.println(0);
		}else{
			System.out.println(array[m-1]);
		}

	}
}
