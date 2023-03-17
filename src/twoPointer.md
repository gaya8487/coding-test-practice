# 투 포인터

포인터 두개를 사용하여 사이의 범위에 해당하는 값들을 탐색한다.

시작 인덱스와 종료 인덱스를 설정하여 배열의 끝가지 탐색하면서 경우의 수를 구한다

---

## 백준 2018

### 연속된 자연수의 합 구하기

📗**문제**

> 자연수 N을 입력 받아 연속된 자연수의 합으로 나타낼 수 있는 경우의 가짓수를 구해라.
>

📃**입력**

```java
15
```

📜**예시**

```java
15, 7+8, 4+5+6, 1+2+3+4+5
```

### 📖

> `start_index` 시작 인덱스
>
>
> `end_index` 끝 인덱스
>

start_index 를 오른쪽으로 한칸 이동하는 것은 왼쪽 값을 삭제 하는 것과 같음

end_index를 오른족으로 한칸 이동하는 것은 오른 쪽 값을 더하는 것과 같음

<aside>
💡 투 포인터 이동 원칙

- sum > N :

  sum - `start_index` ;

  `start_index` ++ ;

- sum < N :

  `end_index` ++;

  sum = sum+ `end_index`;

- sum == N

  `end_index`++;

  sum = sum+`end_index` ;

  count ++;

</aside>

```java
import java.util.Scanner;

class Main {

    public static void main(String[] args) {

         //입력 : 15

        Scanner ac = new Scanner(System.in);
        int N = ac.nextInt();

        int count = 1;
        int start_index = 1;
        int end_index =1;
        int sum = 1;

        while(end_index!=N){

            if(sum==N){
                count ++;
                end_index ++;
                sum = sum+end_index;

            }else if(sum > N){

                sum = sum-start_index;
                start_index ++;

            }else{
                end_index ++;
                sum = sum+end_index;
            }

        }

        System.out.println(count);

    }
}
```

---

## 백준 1940

📗**문제**

> 2 7 4 1 5 3 배열에서 배열의 두수의 합이 9가 되는 경우의 수를 리턴하라
>

📃**입력**

```java
6
9
2 7 4 1 5 3
```

### 📖 두 포인터 i, j 를 양끝에 위치 시킨후 탐색 수행

1. 오름차순 정렬

   (일반적인 정렬 알고리즘의 시간 복잡도는 O(nlongn))

2. 두 포인터 i , j 양끝에 위치 시킨 후 탐색 수행

   양 끝 포인터가 만날때까지 반복

    1. 번호의 합이 크면 큰번호 인덱스 —
    2. 번호의 합이 작으면 작은 번호 인덱스 ++
    3. 같으면 양쪽 포인터 모두 이동 시키고 카운터 증가


```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        //입력
        /*
        6
        9
        2 7 4 1 5 3
        */

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bf.readLine());
        int M = Integer.parseInt(bf.readLine());

        int[] A = new int[N];

        StringTokenizer st = new StringTokenizer(bf.readLine());
        for(int i = 0 ; i<N ; i++){

            A[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(A);

        int count =0;
        int i = 0 ;
        int j = N-1;

        while(i<j){

            if(A[i]+A[j] > M ){

                j--;

            }else if(A[i]+A[j] < M){
                i++;

            }else{

                i++;
                j--;
                count++;
            }

        }
        System.out.println(count);
        bf.close();
    }
}
```