package baekjoon.binarySearch;

import java.util.Arrays;
import java.util.Scanner;

/**
10
6 3 2 10 10 10 -10 -10 7 3
8
10 9 -5 2 3 4 5 -10
* */


public class baek_10816 {
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

		StringBuilder sb = new StringBuilder();

		for(int j=0 ; j<searchArray.length; j++) {

			sb.append(upperBound(numArray,searchArray[j]) - lowerBound(numArray,searchArray[j])).append(" ");

		}


		System.out.println(sb);
	}

	private static int lowerBound(int[] arr, int key) {
		int lo = 0;
		int hi = arr.length;

		// lo가 hi랑 같아질 때 까지 반복
		while (lo < hi) {

			int mid = (lo + hi) / 2; // 중간위치를 구한다.

			/*
			 *  key 값이 중간 위치의 값보다 작거나 같을 경우
			 *  (중복 원소에 대해 왼쪽으로 탐색하도록 상계를 내린다.)
			 */
			if (key <= arr[mid]) {
				hi = mid;
			}

			else {
				lo = mid + 1;
			}

		}
		return lo;
	}

	private static int upperBound(int[] arr, int key) {
		int lo = 0;
		int hi = arr.length;

		// lo가 hi랑 같아질 때 까지 반복
		while (lo < hi) {

			int mid = (lo + hi) / 2; // 중간위치를 구한다.

			// key값이 중간 위치의 값보다 작을 경우
			if (key < arr[mid]) {
				hi = mid;
			}
			// 중복원소의 경우 else에서 처리된다.
			else {
				lo = mid + 1;
			}
		}
		return lo;
	}

}
