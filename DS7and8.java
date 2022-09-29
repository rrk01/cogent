package cogenttest;
import java.util.ArrayList;

public class DS7and8 {
	
	public ArrayList<Integer> stack;
	public ArrayList<Integer> queue;
	
	public DS7and8() {
		stack = new ArrayList<Integer>();
		queue = new ArrayList<Integer>();
	}
	
	public void addStack(int i) {
		stack.add(i);
	}
	
	public int popStack() {
		int a = stack.get(stack.size() - 1);
		stack.remove(stack.size() - 1);
		return a;
	}
	
	public void addQueue(int i) {
		queue.add(i);
	}
	
	public int popQueue() {
		int a = queue.get(0);
		queue.remove(0);
		return a;
	}
	
	public void printStack() {
		for(int i : stack) {
			System.out.println(i);
		}
	}
	
	public void printQueue() {
		for(int i : queue) {
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		
	}
}
