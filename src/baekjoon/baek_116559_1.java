package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baek_116559_1 {
	public static void main(String[] args) throws IOException {
		/**
		 * 수 N개가 주어졌을 때, i번째 수부터 j번째 수까지 합을 구하는 프로그램을 작성하시오.
		 * 첫째 줄에 수의 개수 N과 합을 구해야 하는 횟수 M이 주어진다. 둘째 줄에는 N개의 수가 주어진다. 수는 1,000보다 작거나 같은 자연수이다. 셋째 줄부터 M개의 줄에는 합을 구해야 하는 구간 i와 j가 주어진다.

		 5 3
		 5 4 3 2 1
		 1 3
		 2 4
		 5 5
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int dataN =  Integer.parseInt(st.nextToken()); //데이터 개수 5
		int inputN = Integer.parseInt(st.nextToken());  //질의 개수 3

		int [] sArray = new int[dataN+1];

		//다음 줄 읽기.
		st = new StringTokenizer(br.readLine());

		for (int i=1 ; i<=dataN ; i++){
			sArray[i] = sArray[i-1]+Integer.parseInt(st.nextToken());
		}

		// for(int i=1 ; i<=dataN ; i++){
		//
		// 	System.out.println(sArray[i]);
		// }

		for(int i=0 ; i< inputN ; i++){
			//다음 줄 읽기.
			st = new StringTokenizer(br.readLine());

			int x = Integer.parseInt(st.nextToken()); //1
			int y = Integer.parseInt(st.nextToken()); //3

			System.out.println(sArray[y]-sArray[x-1]);

		}












	}
}
