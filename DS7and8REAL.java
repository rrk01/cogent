package cogenttest;

public class DS7and8REAL {
	
	public int[] stack;
	public int[] queue;
	
	public static int stackIndex = 0;
	public static int queueIndex = 0;
	
	public DS7and8REAL(int capacity) {
		stack = new int[capacity];
		queue = new int[capacity];
	}
	
	public void addStack(int i) {
		stack[stackIndex] = i;
		stackIndex ++;
	}
	
	public void addQueue(int i) {
		queue[queueIndex] = i;
		queueIndex ++;
	}
	
	public int popStack() {
		int a = stack[stackIndex];
		stack[stackIndex] = (Integer) null;
		stackIndex --;
		return a;
	}
	
	public int popQueue() {
		int a = queue[0];
		for(int i = 1; i < queue.length - 1; i ++) {
			queue[i - 1] = queue[i];
		}
		queueIndex --;
		return a;
	}

}
