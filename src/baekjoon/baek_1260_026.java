package baekjoon;


/**
 * 4 5 1 //노드 개수 , 에지개수, 시작점
 * 1 2
 * 1 3
 * 1 4
 * 2 4
 * 3 4
 */

/**
 * 그래프를 DFS로 탐색한 결과와 BFS로 탐색한 결과를 출력하는 프로그램을 작성하시오.
 * 단, 방문할 수 있는 정점이 여러 개인 경우에는 정점 번호가 작은 것을 먼저 방문하고,
 * 더 이상 방문할 수 있는 점이 없는 경우 종료한다. 정점 번호는 1번부터 N번까지이다.
 *
 * 첫째 줄에 DFS를 수행한 결과를, 그 다음 줄에는 BFS를 수행한 결과를 출력한다. V부터 방문된 점을 순서대로 출력하면 된다.
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class baek_1260_026 {

	static ArrayList<Integer>[] dataArray; //인접 리스트
	static Boolean visited[]; //방문 기록 배열;
	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());

		int node = Integer.parseInt(st.nextToken());
		int edge = Integer.parseInt(st.nextToken());
		int start = Integer.parseInt(st.nextToken());

		dataArray = new ArrayList[node+1];

		//인접 리스트 초기화
		for(int  i=1 ; i<=node ; i++){
			dataArray[i] = new ArrayList<>();
		}

		//인접 리스트에 그래프 데이터 저장하기
		//에지 수 만큼 반복
		for (int i = 1; i <=edge; i++) {
			st = new StringTokenizer(bf.readLine());
			int first = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());

			dataArray[first].add(end);
			dataArray[end].add(first);
		}


		for(int i=1 ; i<= node ; i++ ){
			Collections.sort(dataArray[i]);
		};

		visited = new Boolean[node+1];
		Arrays.fill(visited,false);
		dfs(start);

		System.out.print("\n");

		visited = new Boolean[node+1];
		Arrays.fill(visited,false);
		bfs(start);

	}

	private static void dfs(int node) {

		if(visited[node]) return;
		visited[node] = true;

		System.out.print(node + " ");

		//연결 노드 중 방문하지 않았던 노드만 탐색
		for(int n : dataArray[node]){
			dfs(n);
		}
	}

	private static void bfs(int node) {
		Queue<Integer> queue = new LinkedList<Integer>();

		queue.add(node);
		visited[node] = true;

		while(!queue.isEmpty()){
			int nowNode = queue.poll();
			System.out.print(nowNode + " ");

			//연결 노드 중 방문하지 않았던 노드만 탐색
			for(int i : dataArray[nowNode]){
				if(!visited[i]){
					visited[i] = true;
					queue.add(i);
				}
			}
		}
	}
}
