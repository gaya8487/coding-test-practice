package baekjoon.greedy;

/*
10 4790
1
5
10
50
100
500
1000
5000
10000
50000
* */

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class baek_11047 {

	public static void main(String[] args) {

		int n,money;
		int anwser =0 ;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		money = sc.nextInt();

		Integer [] numArray = new Integer[n];

		for(int i=0; i<n ; i++){

			numArray[i] = sc.nextInt();

		}

		Arrays.sort(numArray, Collections.reverseOrder());

		for(int j =0; j<numArray.length;j++){

			if(numArray[j]<=money){
				anwser = anwser+ (money/numArray[j]);
				money = money % numArray[j];

			}

		}

		System.out.print(anwser);

	}

}
