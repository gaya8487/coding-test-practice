package Programmers;

public class pibonachi {
	public static void main(String[] args) {
		solution(5);
	}

	private static void solution(int n) {

		int answer = 0;
		System.out.println(pibo(n));
	}

	static int pibo(int i){

		if(i==0){
			return 0;
		}else if(i==1){
			return 1;
		}else{
			return  (pibo(i-1)+pibo(i-2))%1234567;
		}

	}
}
