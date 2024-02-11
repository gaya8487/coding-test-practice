package baekjoon.추천_문제_풀이.part1;


/*. 1을 한 번, 2를 두 번, 3을 세 번, 이런 식으로
1 2 2 3 3 3 4 4 4 4 5 ..
이러한 수열을 만들고 어느 일정한 구간을 주면 그 구간의 합*/

/*
입력 :
3 7
출력 :
15

// 1 2 [2 3 3 3 4] 4
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class baek_1292 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int start ;
		int end;
		int sum=0;
		start = sc.nextInt();
		end = sc.nextInt();

		List numList = new ArrayList<Integer>();

		for(int i=1 ; i<=end; i++) {

			for(int j=1 ; j<=i; j++) {

				numList.add(i);
			}

		}

		//numList.stream().forEach(i->System.out.print(i+" "));


		//System.out.println(" ");
		for(int i=start-1 ; i<end ; i++ ){
			sum = sum +  (int)numList.get(i);
			//System.out.print(sum);
		}

		System.out.print(sum);

	}
}
