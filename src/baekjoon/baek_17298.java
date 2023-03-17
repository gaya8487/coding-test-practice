package baekjoon;

import java.io.*;
import java.util.Stack;

//오큰수 구하기
//스택을 사용하면 쉽게 구할 수 있다
/*
    크기가 N인 수열 A = A1, A2, ..., AN이 있다. 수열의 각 원소 Ai에 대해서 오큰수 NGE(i)를 구하려고 한다. A
    i의 오큰수는 오른쪽에 있으면서 Ai보다 큰 수 중에서 가장 왼쪽에 있는 수를 의미한다. 그러한 수가 없는 경우에 오큰수는 -1이다.
    예를 들어, A = [3, 5, 2, 7]인 경우 NGE(1) = 5, NGE(2) = 7, NGE(3) = 7, NGE(4) = -1이다.
    A = [9, 5, 4, 8]인 경우에는 NGE(1) = -1, NGE(2) = 8, NGE(3) = 8, NGE(4) = -1이다.
*/

/* 입력
    4
    3 5 2 7
*/

/* 출력
   5 7 7 -1

*/

public class baek_17298 {

    public static void main(String[] args) throws IOException {


        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());  //입력 4

        // 수열 배열
        int [] A = new int[n];
        // 정답 배열
        int[] ans = new int[n];

        String[] str = bf.readLine().split(" "); //입력  3 5 2 7

        //수열 베열에  채우기
        for (int i=0 ; i<n; i++){
            A[i] = Integer.parseInt(str[i]);
        }

        Stack<Integer> stack = new Stack<>();
        //스택 초기화
        stack.push(0);

        for(int j=1 ; j< n ; j++){

            //스택이 비어있지 않고, top보다 입력값이 클 경우 pop
            while(!stack.isEmpty() && A[stack.peek()]< A[j]){

                ans[stack.pop()] = A[j];

            }
           //신규 값 입력 (수열의 인덱스 값 저장)
            stack.push(j);

        }

        //다 돌고 나왔는데도 스택이 남아있다면 -> 오큰수가 없는 숫자들
        //-1로 채우기
        while(!stack.empty()){
            //스택이 빌때까지
            ans[stack.pop()] = -1;

        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for(int i=0 ; i< n ; i++){

            bw.write(ans[i]+" ");
        }

        bw.write("\n");
        bw.flush();


    }

}
