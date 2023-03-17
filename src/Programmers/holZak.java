package Programmers;

public class holZak {

    public  static void main(String[] args) {

        int[] num_list = {1, 2, 3, 4, 5};
        int hol =0;
        int zak =0;

        int[] anwer = new int[2];

        for(int i : num_list){

            if(i%2==0){

                zak = zak+1;
            }else{

                hol = hol +1;
            }

        }
        anwer[0] = hol;
        anwer[1] = zak;

        System.out.println(anwer[0] +" " + anwer[1]);



    }


}
