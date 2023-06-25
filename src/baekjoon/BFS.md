## 너비 우선 탐색 BFS
그래프 완전 탐색 기법 중 하나.
그래프의 시작 노드에서 출발하여 시작 노드를 기준으로 가까운 노드를 먼저 방문하면서 탐색하는 알고리즘.

``Queue`` ``FIFO``를 이용하여 구현하며
시간 복잡도는 O(V+E) 이다.

너비 우선 탐색은 탐색 시작 노드와 가까운 노드를 우선하여 탐색하므로 목표 노드에 도착하는 경로가 여러개일 때 ``최단 경로``를 보장한다.


**한번 방문한 노드를 다시 방문하면 안되기 때문에 노드 방문 여부를 체크할 배열이 필요하다.**


```java

static ArrayList<Integer>[] dataArray ; //인접 리스트
static Boolean visited[]; //방문 기록 배열;

public static void main(String[] args) throws IOException {
	bfs(start값);
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
```
