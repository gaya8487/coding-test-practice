package baekjoon;

import java.io.*;
import java.util.*;

//카드2
//큐 문제

/*
   N장의 카드가 있다. 각각의 카드는 차례로 1부터 N까지의 번호가 붙어 있으며, 1번 카드가 제일 위에, N번 카드가 제일 아래인 상태로 순서대로 카드가 놓여 있다.

이제 다음과 같은 동작을 카드가 한 장 남을 때까지 반복하게 된다. 우선, 제일 위에 있는 카드를 바닥에 버린다. 그 다음, 제일 위에 있는 카드를 제일 아래에 있는 카드 밑으로 옮긴다.

예를 들어 N=4인 경우를 생각해 보자. 카드는 제일 위에서부터 1234 의 순서로 놓여있다. 1을 버리면 234가 남는다. 여기서 2를 제일 아래로 옮기면 342가 된다. 3을 버리면 42가 되고, 4를 밑으로 옮기면 24가 된다. 마지막으로 2를 버리고 나면, 남는 카드는 4가 된다.

N이 주어졌을 때, 제일 마지막에 남게 되는 카드를 구하는 프로그램을 작성하시오.
*/

/* 입력
    6
*/

/* 출력
   4
*/

public class baek_2164 {

    public static void main(String[] args) throws IOException {

        Scanner ac = new Scanner(System.in);
        int N = ac.nextInt();

        Queue<Integer> que = new LinkedList<Integer>() ;

        //큐에 카드 담기
        for(int i=1 ; i<=N ; i++) {

            que.add(i);

        }
        //카드가 한장 남을때까지

        while(que.size() > 1){

            //버리기
            que.poll();
            //버린거 맨 아래에 붙이기
            que.add(que.poll());
        }

        System.out.println(que.poll());
    }

}
