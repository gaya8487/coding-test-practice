package baekjoon.추천_문제_풀이.part1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class baek_2693 {
/*
4
1 2 3 4 5 6 7 8 9 1000
338 304 619 95 343 496 489 116 98 127
931 240 986 894 826 640 965 833 136 138
940 955 364 188 133 254 501 122 768 408

8
489
931
768

각 테스트 케이스에 대해 한 줄에 하나씩 배열 A에서 3번째 큰 값을 출력한다.
*/
	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(in.readLine());

		int n = Integer.parseInt(st.nextToken());

		for(int j=0; j<n ; j++){

			int result=0;
			st = new StringTokenizer(in.readLine()); //줄바꿈
			int[] array = new int[10];

			for (int i = 0; i < 10; i++) {
				array[i] = Integer.parseInt(st.nextToken());

			}
			Arrays.sort(array);
			result = array[7];


			System.out.println(result);
		}

	}

}
