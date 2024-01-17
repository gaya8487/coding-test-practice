package baekjoon.dfs_bfs;


import java.util.Scanner;


/**
 7
 6
 1 2
 2 3
 1 5
 5 2
 5 6
 4 7
 **/

//4
public class baek_2606 {
	//바이러스
	static boolean[][] graph;
	static boolean[] visited;
	static int n;
	static int m;
	static int anwer;

public static void main(String[] args)  {

	//0.입력 및 초기화
	Scanner sc = new Scanner(System.in);

	n = sc.nextInt();
	m = sc.nextInt();

	graph = new boolean[n+1][n+1];
	visited = new boolean[n+1];

	//1. 그래프 정보 입력

	int x,y;
	for(int i=0 ; i<m; i++){

		x = sc.nextInt();
		y = sc.nextInt();

		graph[x][y]= graph[y][x] =  true;
	}

	//2. dfs 및 결과 출력
	dfs(1);
	System.out.println(anwer-1);

}

	//3. dfs 구현
	private static void dfs(int idx) {

	anwer++;
	visited[idx] = true;

	for(int i=0; i<=n ; i++){

		if(!visited[i]&&graph[idx][i]){

			System.out.println("idx :" +idx +" " + "i "+ i);
			dfs(i);
		}
	}

	}

}
