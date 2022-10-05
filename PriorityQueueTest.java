package cogenttest;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class PriorityQueueTest {
	public static PriorityQueue<Integer> pqInt = new PriorityQueue<Integer>();
	public static PriorityQueue<EmployeeBean> pqEmp = new PriorityQueue<EmployeeBean>();
	
	public static Deque<String> dqString = new LinkedList<String>();
	public static Deque<EmployeeBean> dqEmp = new LinkedList<EmployeeBean>();
	
	public static void main(String[] args) {
		pqInt.add(5);
		pqInt.add(10);
		pqInt.add(69);
		pqInt.add(420);
		pqInt.add(1337);
		pqInt.add(10849);
		pqInt.peek();
		pqInt.offer(0);
		pqInt.remove();
		
		pqEmp.add(new EmployeeBean());
		pqEmp.add(new EmployeeBean(12345,"IYH", "SN", "IYH@SN.ME", 27, false, "Sample City", "Sample Country"));
		pqEmp.add(new EmployeeBean(23456,"IR8", "SN", "IR8@SN.ME", 27, false, "Dallas", "USA"));
		pqEmp.peek();
		pqEmp.offer(new EmployeeBean(34567,"HellYeah", "BEST", "HellYeah@best.com", 29, true, "Vancouver", "Canada"));
		pqEmp.remove();
		
		dqString.add("World");
		dqString.addFirst("Hello");
		dqString.addLast("I guess.");
		dqString.removeLast();
		
		dqEmp.push(new EmployeeBean());
		dqEmp.offer(new EmployeeBean(12345,"IYH", "SN", "IYH@SN.ME", 27, false, "Sample City", "Sample Country"));
		dqEmp.offerFirst(new EmployeeBean(23456,"IR8", "SN", "IR8@SN.ME", 27, false, "Dallas", "USA"));
		dqEmp.offerLast(new EmployeeBean(34567,"HellYeah", "BEST", "HellYeah@best.com", 29, true, "Vancouver", "Canada"));
		dqEmp.removeFirst();
		
	}
}
