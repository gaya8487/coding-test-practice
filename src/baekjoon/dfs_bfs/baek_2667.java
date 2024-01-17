package baekjoon.dfs_bfs;

/*
7
0110100
0110101
1110101
0000111
0100000
0111110
0111000
*/

/*
3
7
8
9
*/
//인접되어있지 않은 단지의 갯수를 구하기
//한 단지 안에 몇개 집이 있는지 구하기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class baek_2667 {


	final static int MAX = 25+10;
	static boolean[][] graph;

	//방문 기록 이차원 배열
	static boolean[][] visited;

	//단지 수
	static int danjiCount;

	static int dirX[] = {1,-1,0,0};
	static int dirY[] = {0,0,1,-1};

	private static void dfs(int x, int y) {

		visited[x][y]=true;
		danjiCount ++;

		//상하좌우 확인
		for(int i=0; i<4;i++){
			int newX = x+ dirX[i];
			int newY = y+ dirY[i];

			if(!visited[newX][newY]&&graph[newX][newY]){
				dfs(newX,newY);
			}

		}
		
	}

	public static void main(String[] args) throws IOException {

		//입력 및 초기화
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		graph = new boolean[MAX][MAX];
		visited = new boolean[MAX][MAX];

		for(int i=1; i<=n ; i++) {
			String s = br.readLine();
			for (int j = 1; j <=n; j++) {
				graph[i][j] = s.charAt(j - 1) == '1';
			}
		}

		
		//(1,1)부터 돌면서 (N,N)까지 돌면서 초기화

		//아파트 개수를 담아줄 arrayList
		ArrayList<Integer> houseCount = new ArrayList<>();

		for(int i=1; i<=n ; i++) {
			for (int j = 1; j <= n; j++) {
				if(!visited[i][j]&&graph[i][j]){
					danjiCount =0;
					dfs(i,j);
					houseCount.add(danjiCount);
				}

			}
		}

		//출력

		System.out.println(houseCount.size());
		Collections.sort(houseCount);

		for(Integer house : houseCount){
			System.out.println(house);
		}


	}


}
