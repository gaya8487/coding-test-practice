package baekjoon.추천_문제_풀이.part1;

import java.util.Scanner;

import javax.annotation.processing.SupportedSourceVersion;

public class baek_1978 {

/*
4
1 3 5 7
* */
	static int[] array ;
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n;
		n = sc.nextInt();
		array =  new int[n];

		for(int i=0; i<n ; i++){
			array[i] = sc.nextInt();
		}

		int count = 0;
		for(int num : array){
			boolean flag = true;

			if(num==1){
				continue;
			}
			for(int j=2; j< num-1 ; j++){
				if(num%j==0){
					flag =false;
				}
			}

			if(flag==true){

				count++;
			}

		}

		System.out.println(count);

	}

}
