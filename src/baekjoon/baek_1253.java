package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class baek_1253 {

	/**
	 * 주어진 n개의 수에서 다른 두수의 합으로 표현되는 수의 개수
	 * 10
	 * 1 2 3 4 5 6 7 8 9 10
	 */
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int dataNo = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());

		int[] numA = new int[dataNo];

		for (int z=0 ; z<dataNo ; z++){

			numA[z] = Integer.parseInt(st.nextToken());
		}
		
		//정렬
		Arrays.sort(numA);

		int count = 0;

		for (int k=0 ; k< numA.length ; k++){

			int i = 0;
			int j = dataNo-1;
			long find = numA[k];

			while(i<j){
				if(numA[i]+numA[j] == find){

					if(i!=k && j!=k){
						count ++;
						break;
					} else if (i==k) {
						i++;
					} else if (j==k) {
						j--;
					}
				} else if (numA[i]+numA[j]>find) {
					j--;
				}else{
					i++;
				}
			}

		}

		System.out.println(count);
		br.close();








	}
}
