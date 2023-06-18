package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * N×M크기의 배열로 표현되는 미로가 있다.
 *
 * 1	0	1	1	1	1
 * 1	0	1	0	1	0
 * 1	0	1	0	1	1
 * 1	1	1	0	1	1
 * 미로에서 1은 이동할 수 있는 칸을 나타내고, 0은 이동할 수 없는 칸을 나타낸다. 이러한 미로가 주어졌을 때, (1, 1)에서 출발하여 (N, M)의 위치로 이동할 때 지나야 하는 최소의 칸 수를 구하는 프로그램을 작성하시오. 한 칸에서 다른 칸으로 이동할 때, 서로 인접한 칸으로만 이동할 수 있다.
 *
 * 위의 예에서는 15칸을 지나야 (N, M)의 위치로 이동할 수 있다. 칸을 셀 때에는 시작 위치와 도착 위치도 포함한다.
 */

public class baek_2178 {
	static int[] dx = {0,1,0,-1};
	static int[] dy = {1,0,-1,0};

	/**
	 * dx dy 의 의미
	 * dx[0]=0 dy[0] = 1 => 아래로 1만큼
	 * dx[1]=1 dy[1] = 0 => 오른쪽으로 1만큼
	 * dx[2]=0 dy[2]= -1 => 위로 1만큼
	 * 	-> 상하 좌우를 탐색하기위한 값
	 */

	//방문 기록 저장 배열
	static boolean[][] visited;
	static int[][] A;
	static int N,M;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		A = new int[N][M];
		visited = new boolean[N][M];

		for(int i=0;i<N;i++){
			st = new StringTokenizer(br.readLine());
			String line = st.nextToken(); //한줄씩 받아옴 101010...
			for(int j=0; j<M; j++){
				A[i][j] = Integer.parseInt(line.substring(j,j+1)); //한줄씩 받아온 것을 한글자씩 잘라서 너줌
			}
		}
		//입력값 받아오기 end

		BFS(0,0);
		System.out.println(A[N-1][M-1]);

	}


	private static void BFS(int i, int j){
		Queue<int[]> queue = new LinkedList<>();
		queue.offer(new int[] {i,j}); //시작점을  큐에 넣어줌.
		visited[i][j] = true; // 기방문 배열의 뽑힌 위치에 true 넣어줌
		while(!queue.isEmpty()){
			int now[] = queue.poll(); //큐에서 값을 뽑음
				for(int k=0; k<4 ; k++){ //상하좌우로 탐색
					int x = now[0] + dx[k];
					int y = now[1] + dy[k];

					if(x>=0 && y>=0 && x<N && y<M){ //배열의 크기를 넘어가면 안됨

						if(A[x][y]!=0 && !visited[x][y]){ //1이어서 갈 수 있어야 하고 기방문한 곳이면 안됨
							//탐색
							visited[x][y] = true;
							A[x][y] = A[now[0]][now[1]]+1; // A 배열에 depth를 현재 노드의 depth+1로 업데이트
							queue.add(new int[]{x,y}); //큐에다 데이터 삽입
						}

					}
			}
		}


	}

}
