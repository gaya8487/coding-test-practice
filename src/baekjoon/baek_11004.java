package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

/*
* k번째 수 구하기
* 2번째줄 입력값을 오름차 순 했을 때 k번째 수를 구하라
* 
* 입력 첫번째 줄 1번째 값 : 두번째 줄에 들어올 숫자 갯수
* 입력 첫번째 줄 2번째 값 : K번째 수
*
* */

/* 입력
    5 2
    4 1 2 3 5
*/

/*
*  2
* */

public class baek_11004 {

    public static void main(String[] args) throws IOException {


        /* 입력
            5 2
            4 1 2 3 5
        */

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(in.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(in.readLine());

        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }


        List<Integer> arrayList = Arrays.stream(A).boxed().collect(Collectors.toList());

        arrayList.sort(Comparator.naturalOrder());


        System.out.println( arrayList.get(K-1));




    }

}
