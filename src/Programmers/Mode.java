package Programmers;

import java.util.ArrayList;

public class Mode {

    public  static void main(String[] args){
      // int[] testArray = {1, 1, 2, 2};
      // int[] testArray = {1, 2, 3, 3, 3, 4};
      //  int[] testArray = {1};
        int[] testArray = {0};

        Mode programmers = new Mode();
        int answer =programmers.freNum(testArray);

       System.out.println("answer : " + answer);


    }

    int freNum(int[] array ){

        ArrayList<int[] > cntList = new ArrayList();

        int answer = 0;
        int num = 0;
        int numCnt = 0;



        for(int j=0; j<array.length;j++){

            int[] arrayNum = new int[2];

            num = array[j];
            numCnt = 0;
            // System.out.println("+"+num+"+");

            for(int i=0; i<array.length;i++){

               // System.out.println("|"+num+"|" + "|" + array[i] + "|");

                if( num == array[i] ){

                    numCnt = numCnt +1;

                    //System.out.println("*"+numCnt +"*");

                }

                arrayNum[0] = num;
                arrayNum[1] = numCnt;
            }


            cntList.add(arrayNum);
        }

        int maxFre = 0;
        int maxNum = 0;

        for(int[] a : cntList){

            if(maxFre < a[1]){

                maxFre = a[1];
                maxNum = a[0];


            }

            System.out.println(a[0]+" " + a[1] + " maxFre : " + maxFre + " num : " + maxNum);
        }

        answer = maxNum;

        for(int[] a : cntList) {

            if(maxFre == a[1] && maxNum!=a[0]){

                System.out.println("== " + a[1] + " " + a[0] +" ==");

                answer = -1;

            }

        }



        return answer;
    }


}
