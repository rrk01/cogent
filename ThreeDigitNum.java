package cogenttest;

public class ThreeDigitNum {
	
	public static void sumOfThree(int n) {
		int sum = 0;
		for(int i = 0; i < 3; i ++) {
			sum += n%10;
			n /= 10;
		}
		System.out.println(sum);

	}
	
	public static void main(String[] args) {
		sumOfThree(123);
	}

}
