package baekjoon.추천_문제_풀이.part1;

import java.util.Arrays;
import java.util.Scanner;

/*
20
7
23
19
10
15
25
8
13

숫자 7개를 합쳐서 100이 되는 경우의 수 찾기
*/
public class baek_2309 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int sum=0;
		int[] array = new int[9];
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
			sum = sum+ array[i];
		}

		Arrays.sort(array);
		int target1 = 0,target2 = 0;

		for(int i = 0; i < array.length; i++){
			for(int j = i+1; j < array.length; j++){

				if(sum-array[i]-array[j]==100){
					target1 = array[i];
					target2 = array[j];
				}
			}
		}

		for(int a : array){
			if(a==target1||a==target2){
				continue;
			}
			System.out.println(a);
		}
	}
}
