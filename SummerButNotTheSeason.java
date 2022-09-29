package cogenttest;

public class SummerButNotTheSeason {
	
	public SummerButNotTheSeason() {
		
	}
	
	public static int iterativeSum(int i) { //O(N) time
		int a = 0;
		for(int j = 1; j <= i; j ++)
			a += j;
		return a;
	}
	
	public static int gaussSum(int i) { //O(1) time
		return i*(i+1)/2;
	}
	
	public static void main(String[] args) {
		System.out.println(iterativeSum(10));
		System.out.println(gaussSum(10));
	}

}
