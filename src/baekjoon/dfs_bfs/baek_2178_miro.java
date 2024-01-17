package baekjoon.dfs_bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class baek_2178_miro {

	//상하좌우를 탐색하기 위한 변수
	static int[] dx = {0,1,0,-1};
	static int[] dy = {1,0,-1,0};
	
	//방문배열
	static boolean[][] visited;

	static int[][] a;
	static int n,m;


	/*
	입력
4 6
101111
101010
101011
111011
	*/

	/*출력 : 15 */

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());

		a = new int[n][m];
		//방문 배열 초기화
		visited = new boolean[n][m];

		for(int i=0; i<n ; i++){

			st = new StringTokenizer(br.readLine());
			String line = st.nextToken();

			for(int j=0; j<m ; j++){

				a[i][j] = Integer.parseInt(line.substring(j,j+1));
			}
		}

		//입력 끝;

		bfs(0,0);
		System.out.println(a[n-1][m-1]);


	}

	private static void bfs(int i, int j) {
		Queue<int []> queue = new LinkedList<>();
		//시작 노드 삽입
		queue.offer(new int[]{i,j});
		//방문 노드에 기록
		visited[i][j] = true;

		while(!queue.isEmpty()){

			int nowQueue[] = queue.poll();
			for(int k =0; k<4; k++){
				int x= nowQueue[0]+dx[k];
				int y = nowQueue[1]+dy[k];

				//상하좌우 유효성 검사
				if(x>=0&&y>=0 && x<n&&y<m){

					//갈 수 있는 곳인지 / 방문한 곳이 아닌지
					if(a[x][y]!=0&&!visited[x][y]){
						visited[x][y] = true;
						a[x][y] = a[nowQueue[0]][nowQueue[1]]+1;

						queue.add(new int[]{x,y});

					}
				}
			}
		}

	}

}
