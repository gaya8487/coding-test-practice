package baekjoon;


import java.util.Scanner;

public class baek_2750_BubbleSort {


    //N개의 수가 주어졌을 때 정렬하는 프로그램을 작성하시오


    //입력
    //    5 //수의 개수
    //    5
    //    2
    //    3
    //    4
    //    1


    //출력
    //    1
    //    2
    //    3
    //    4
    //    5


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] A = new int[N];

        for(int i=0 ; i<N ; i++){

            A[i] = sc.nextInt();
        }

        //자바의 sort 이용
        //Arrays.sort(A);

        //버블 정렬 구현

        for (int i=0; i<N-1 ; i++){

            for(int j=0 ; j< N-1-i ; j++){

                if(A[j] > A[j+1]){
                    //swap
                    int tmp = A[j+1];
                    A[j+1] = A[j];
                    A[j] = tmp;

                }
            }

        }


        for(int i : A){
            System.out.println(i);

        }


    }



}
