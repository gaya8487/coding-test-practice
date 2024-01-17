package baekjoon.dfs_bfs;

import java.io.IOException;
import java.util.Scanner;
import java.util.*;


/**
 *그래프를 DFS 와 BFS로 탐색한 결과를 출력
 * 노드가 여러개 일 때는 작은 것을 먼저 탐색
 * 4 5 1
 * 1 2
 * 1 3
 * 1 4
 * 2 4
 * 3 4
 */


public class baek_1260_dfs_bfs {

	static ArrayList<Integer>[] A ; //인접 리스트
	static boolean visited[] ; //방문 배열

	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt(); //노드
		int M = scan.nextInt(); // 에지 개수
		int start = scan.nextInt(); // 시작점
		
		A = new ArrayList[N+1];
		
		//인접 리스트 초기화 (노드 수 만큼)
		for(int i=1 ; i<=N ; i++){
			A[i] = new ArrayList<>();
		}

		//인접 리스트에 담아주기 (엣지 수만큼)
		for(int j=1; j<=M ; j++){
			int S = scan.nextInt();
			int E = scan.nextInt();

			A[S].add(E); //양방향 에지 (양쪽에 에지를 더하기)
			A[E].add(S);
		}

		//방문 배열 초기화
		visited = new boolean[N + 1];
		Arrays.fill(visited,false);


		//방문 노드 정렬
		for(int i=1 ; i<=N ; i++) {

			Collections.sort(A[i]);

		}


		//방문 배열 초기화
		visited = new boolean[N + 1];
		Arrays.fill(visited,false);
		DFS(start);

		System.out.println();

		//방문 배열 초기화
		visited = new boolean[N + 1];
		Arrays.fill(visited,false);
		BFS(start);

		System.out.println();
	}

	public static void DFS(int node){ //DFS 구현

		System.out.print( node + " ");
		visited[node] = true;

		for(int i : A[node]){
			if(!visited[i]){
				DFS(i);
			}
		}
	}

	public static  void BFS(int node){ // BFS 구현

		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(node);
		visited[node] = true;

		while(!queue.isEmpty()){

			int now_Node = queue.poll();
			System.out.print(now_Node + " ");
			for(int i : A[now_Node]){
				if(!visited[i]){
					visited[i] = true;
					queue.add(i);
				}
			}
		}
	}


}
