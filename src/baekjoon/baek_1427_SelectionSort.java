package baekjoon;

import java.util.Scanner;

public class baek_1427_SelectionSort {

    public static void main(String[] args) {

        //선택 정렬로 내림차순 정렬

        Scanner sc = new Scanner(System.in);
        String str= sc.next();
        int[] arrInt = new int[str.length()];

        for(int i=0 ; i<str.length();i++){

            arrInt[i] = Integer.parseInt(str.substring(i,i+1));
        }


        for(int i=0 ; i< arrInt.length; i++){

            int max = i;

            //남은 정렬 부분에서 최댓값 찾기
            for(int j = i+1 ; j<arrInt.length ; j++){

                if(arrInt[j] > arrInt[max]){
                    max = j;

                }

            }

            //현재의 i값고 Max 값 중 Max값이 더 크면 swap
            if(arrInt[i] < arrInt[max]) {

                int tmp = arrInt[i];
                arrInt[i] = arrInt[max];
                arrInt[max] = tmp;

            }


        }

        for (int i : arrInt){

            System.out.print(i);
        }

    }

}
