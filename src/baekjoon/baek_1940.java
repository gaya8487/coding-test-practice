package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class baek_1940 {

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
