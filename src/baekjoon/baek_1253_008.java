package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baek_1253_008 {
	/**
	 * 10
	 * 1 2 3 4 5 6 7 8 9 10
	 * 주어진 N개의 수에서 다른 두 수의 합으로 표현되는 수가 몇개인지 찾아라
	 * 투 포인터 알고리즘
	 *
	 */
	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int num = Integer.parseInt(bf.readLine());
		int result = 0;

		int[] array = new int[num];

		StringTokenizer st = new StringTokenizer(bf.readLine());

		for(int i=0; i<num ; i++){
			array[i]  = Integer.parseInt(st.nextToken());
		}

		for(int k=0; k<num; k++ ){

			//투 포인트 포인터 초기화
			int i = 0;
			int j = num-1;
			int find = array[k];

			while(i<j){
				if(array[i] + array[j] == find){

					//find는  서로 다른 두수의 합이여야 함
					if(i== k && j==k){
						i++;
						j--;
					}
					if(i!=k && j!=k ){
						result++;
						break;
					}

				}else if(array[i]+array[j]< find ){
					i++;
				}else{
					j--;
				}
			}
		}
		System.out.println(result);
		bf.close();

	}

}
