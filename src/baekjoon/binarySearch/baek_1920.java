package baekjoon.binarySearch;

import java.util.Arrays;
import java.util.Scanner;

/**
5
4 1 5 2 3
5
1 3 7 9 5
* */


public class baek_1920 {
	public static void main(String[] args) {

		int n; //입력 문자열 개수
		int m; // 찾을 문자열 개수
		int[] numArray = null; // 입력 문자열 저장
		int [] searchArray = null; //찾을 문자열 저장

		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		numArray = new int[n];
		
		for(int i=0; i<n; i++){

			numArray[i]  = sc.nextInt();
		}

		Arrays.sort(numArray);

		m = sc.nextInt();
		searchArray = new int[m];

		for(int i=0; i<m; i++){

			searchArray[i]  = sc.nextInt();
		}

		
		//이진 탐색 시작

		for(int j=0 ; j<searchArray.length; j++) {

			boolean find = false;
			int start = 0;
			int end = numArray.length - 1;
			int target = searchArray[j];

			while (start <= end) {

				int midI = (start + end) / 2;
				int midV = numArray[midI];

				if (midV > target) {

					end = midI - 1;
				} else if (midV < target) {

					start = midI + 1;
				} else {

					find = true;
					break;
				}
			}

			if (find) {
				System.out.println(1);
			} else {
				System.out.println(0);
			}

		}

	}

}
