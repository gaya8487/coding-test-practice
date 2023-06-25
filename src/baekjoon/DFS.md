## 깊이 우선 탐색 DFS
그래프 완전 탐색 기법 중 하나.
그래프의 시작 노드에서 출발하여 탐색할 한 족 분기를 정하여 최대깊이까지 탐색을 마친 후 다른 쪽 분기로 이동하여 다시 탐색을 수행하는 알고리즘.

``재귀함수``와 ``스택 자료`` 구조를 이용하여 구현하며
시간 복잡도는 O(V+E) 이다.

DFS를 응용하여 풀 수 있는 문제에는 단절점 찾기, 단절선 찾기, 사이클 찾기, 위상 정렬 등이 있다.


**한번 방문한 노드를 다시 방문하면 안되기 때문에 노드 방문 여부를 체크할 배열이 필요하다.**


```java

static ArrayList<Integer>[] dataArray ; //인접 리스트
static Boolean visited[]; //방문 기록 배열;

public static void main(String[] args) throws IOException {

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
	
	dfs(start값);
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
```
