package baekjoon.추천_문제_풀이.part1;

/*
1
13

0 2 3
양의 정수 n이 주어졌을 때, 이를 이진수로 나타냈을 때 1의 위치를 모두 찾으시오
*/

import java.util.ArrayList;
import java.util.Scanner;

public class baek_3460 {
	public static void main(String[] args) {

		int n,m;

		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();

		for(int j=0 ; j<n ; j++){

			m = sc.nextInt();
			String binary  = Integer.toBinaryString(m);

			String[] binaryArray = binary.split("");

			for(int i= binaryArray.length-1; i>=0 ; i--){
				if(binaryArray[i].equals("1")){
					System.out.print(((binaryArray.length-1)-i)+" ");
				}
			}

		}

	}

}
