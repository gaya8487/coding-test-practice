package etc;


import java.util.Stack;

public class stackToQueue {
	//스택으로 큐 구현하기


	public static void main(String[] args) {
		Qstack a = new Qstack();
		a.enqueue(1);
		a.enqueue(2);
		a.enqueue(3);

		System.out.println(a.dequeue());
		System.out.println(a.dequeue());
		System.out.println(a.dequeue());


	}

	static class Qstack {
		Stack<Integer> oldStack;
		Stack<Integer> newStack;

		public Qstack() {
			oldStack = new Stack<>();
			newStack = new Stack<>();
		}

		public void enqueue(int a) {
			oldStack.push(a);
		}

		public int dequeue() {
			int result = -1;

			if(newStack.isEmpty()) {
				while(!oldStack.isEmpty()) {
					newStack.push(oldStack.pop());
				}
				result = newStack.pop();
			}

			//newStack에 남아있는 값이 있으면 다시 #1로 옮겨준다.
			if(!newStack.isEmpty()) {
				while(!newStack.isEmpty()) {
					oldStack.push(newStack.pop());
				}
			}

			return result;
		}
	}




}
