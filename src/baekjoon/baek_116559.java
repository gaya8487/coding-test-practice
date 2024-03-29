package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class baek_116559 {
	/**
	 * 수 N개가 주어졌을 때, i번째 수부터 j번째 수까지 합을 구하는 프로그램을 작성하시오.
	 * 첫째 줄에 수의 개수 N과 합을 구해야 하는 횟수 M이 주어진다. 둘째 줄에는 N개의 수가 주어진다. 수는 1,000보다 작거나 같은 자연수이다. 셋째 줄부터 M개의 줄에는 합을 구해야 하는 구간 i와 j가 주어진다.

	 5 3 //데이터 갯수, 질의 개수
	 5 4 3 2 1 //대상 배열
	 1 3
	 2 4
	 5 5
	 */

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		ArrayList<Double> arrayList = new ArrayList<>();

		int x=1;
		int y =2;

		Double d = (double)(x/y);



		for (Double a : arrayList ){
			System.out.println(a);
		}


		int dataNo = Integer.parseInt(st.nextToken());
		int quizNo = Integer.parseInt(st.nextToken());

		int s[] = new int[dataNo+1];

		st = new StringTokenizer(br.readLine());

		for (int i = 1; i <= dataNo; i++) {
			s[i] = s[i-1] +  Integer.parseInt(st.nextToken());
		}

		for (int q = 0; q <quizNo ; q++) {

			st = new StringTokenizer(br.readLine());

			int i = Integer.parseInt(st.nextToken());
			int j = Integer.parseInt(st.nextToken());

			System.out.println(s[j]-s[i-1]);

		}







	}

}
