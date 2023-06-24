## 깊이 우선 탐색 DFS
그래프 완전 탐색 기법 중 하나.
그래프의 시작 노드에서 출발하여 탐색할 한 족 분기를 정하여 최대깊이까지 탐색을 마친 후 다른 쪽 분기로 이동하여 다시 탐색을 수행하는 알고리즘.

재귀함수와 스택 자료 구조를 이용하여 구현하며
시간 복잡도는 O(V+E) 이다.

DFS를 응용하여 풀 수 있는 문제에는 단절점 찾기, 단절선 찾기, 사이클 찾기, 위상 정렬 등이 있다.


### 핵심
한번 방문한 노드를 다시 방문하면 안되기 때문에 노드 방문 여부를 체크할 배열이 필요하다.




```java

static ArrayList<Integer>[] dataArray ; //인접 리스트
static Boolean visited[]; //방문 기록 배열;

public static void main(String[] args) throws IOException {
	for(노드 수){
		if(방문 기록 == false){
            count++;
            dfs(i);
		}
	}
	System.out.println(count);
}

 dfs(int i) {
	if(방문 기록==true) return;
	visited[i] = true;

	//연결 노드 중 방문하지 않았던 노드만 탐색하기
	for(int n : dataArray[i]){
	    dfs(n);
	}
}
```
