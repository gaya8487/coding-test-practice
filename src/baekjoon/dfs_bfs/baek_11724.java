package baekjoon.dfs_bfs;

import java.util.Scanner;

/*
6 5
1 2
2 5
5 1
3 4
4 6
* */

/*2*/

public class baek_11724 {
//연결 요소 구하기

	static boolean[][] graph;
	static boolean[] visited;
	static int n;
	static int m;
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		 n= sc.nextInt();
		 m = sc.nextInt();

		graph  = new boolean[n+1][n+1];
		visited = new boolean[n+1];

		int x,y;
		int answer=0;
		for(int i=0; i<m ; i++){

			x= sc.nextInt();
			y= sc.nextInt();
			graph[x][y] = graph[y][x] = true;
		}

		for(int j=0; j<=n ;j++){




			if(!visited[j]){
				dfs(j);
				answer++;
			}
		}


		System.out.println(answer);


	}

	private static void dfs(int idx) {

		visited[idx] = true;
		for(int i=0; i<=n ; i++){
			if(!visited[i]&&graph[idx][i]){
				System.out.println("idx :" +idx +" " + "i "+ i);
				dfs(i);
			}

		}

	}
}
