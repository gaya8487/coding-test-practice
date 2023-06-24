package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

import javax.swing.*;

public class baek_11724_023 {

/**
	6 5 //노드개수, 에지 개수
	1 2
	2 5
	5 1
	3 4
	4 6

 	출력 :2
 **/
/**
 *
 * 방향없는 그래프가 주어졌을 때 연결요소의 개수를 구하라
 *  DFS 탐색 -> 한번의 DFS 가 끝날때까지 탐색한 모든 노드의 집합 = 하나의 연결요소
 */

	static ArrayList<Integer>[] dataArray ; //인접 리스트
	static Boolean visited[]; //방문 기록 배열;

	public static void main(String[] args) throws IOException {

		int count = 0;

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());

		int node = Integer.parseInt(st.nextToken());
		int edge = Integer.parseInt(st.nextToken());

		dataArray = new ArrayList[node+1];
		visited = new Boolean[node+1];
		Arrays.fill(visited,false);
		
		//인접 리스트 초기화
		// 노드 수 만큼 반복
		for(int i=1 ; i<= node ; i++ ){
			dataArray[i] = new ArrayList<Integer>();
		};

		//인접 리스트에 그래프 데이터 저장하기
		//에지 수 만큼 반복
		for(int j=1 ; j<=edge ; j++){

			st = new StringTokenizer(bf.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());

			dataArray[start].add(end);
			dataArray[end].add(start);
		}

		for(int i=1; i<=node; i++){
			if(!visited[i]){
				count++;
				dfs(i);
			}
		}

		System.out.println(count);
	}

	static  private void dfs(int i) {
		if(visited[i]) return;
		visited[i] = true;

		//연결 노드 중 방문하지 않았던 노드만 탐색하기
		for(int n : dataArray[i]){
			dfs(n);
		}
	}

}
