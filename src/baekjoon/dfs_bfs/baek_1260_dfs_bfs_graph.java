package baekjoon.dfs_bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *그래프를 DFS 와 BFS로 탐색한 결과를 출력
 * 노드가 여러개 일 때는 작은 것을 먼저 탐색
  4 5 1
  1 2
  1 3
  1 4
  2 4
  3 4
 */



public class baek_1260_dfs_bfs_graph {
	final static int MAX = 1000 + 10;
	static boolean graph[][];
	static boolean visited[];
	static ArrayList<Integer> queue;
	static int N, M, V;

		static void dfs(int idx) {
			System.out.print(idx + " ");
			visited[idx] = true;
			for (int i = 1; i <= N; i++)
				if (!visited[i] && graph[idx][i]) {
					System.out.println("idx :" +idx +" " + "i "+ i);
					dfs(i);
				}
		}

		static void bfs() {
			queue = new ArrayList<>();
			visited = new boolean[MAX];

			queue.add(V);
			visited[V] = true;

			while (!queue.isEmpty()) {
				int idx = queue.remove(0);
				System.out.print(idx + " ");
				for (int i = 1; i <= N; i++)
					if (!visited[i] && graph[idx][i]) {
						visited[i] = true;

						System.out.println("idx :" +idx +" " + "i "+ i);
						queue.add(i);
					}
			}
		}

		public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			N = Integer.parseInt(st.nextToken());
			M = Integer.parseInt(st.nextToken());
			V = Integer.parseInt(st.nextToken());

			graph = new boolean[MAX][MAX];
			visited = new boolean[MAX];

			for (int i = 0; i < M; i++) {
				st = new StringTokenizer(br.readLine(), " ");
				int x = Integer.parseInt(st.nextToken());
				int y = Integer.parseInt(st.nextToken());
				graph[x][y] = graph[y][x] = true;
			}

			dfs(V);
			System.out.println();

			bfs();
		}
	}
