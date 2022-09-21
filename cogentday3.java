package cogenttest;

public class cogentday3 {
	public void printName() {
		System.out.println("Ryan Karki");
	}
	
	public void evenOrOdd(int i) {
		if(i%2==0) {
			System.out.println("Even");
		}else{
			System.out.println("Odd");
		}
	}
	
	public void findBigger(int a, int b) { 
		if(a > b) {
			System.out.println(a);
		}else if(b > a) {
			System.out.println(b);
		}else {
			System.out.println("a = b");
		}
	}
	
	public int[] swap(int a, int b) {
		int arr[] = new int[2];
		arr[0] = b;
		arr[1] = a;
		return arr;
	}
	
	public void evenOrOddTernary(int i) {
		String s = "";
		s = i%2==0 ? "Even" : "Odd";
		System.out.println(s);
	}
	
	public int findBiggest(int a, int b, int c) {
		int biggest = -9999;
		int[] arr = new int[3];
		arr[0] = a;
		arr[1] = b;
		arr[2] = c;
		for(int i = 0; i < 3; i ++) {
			if (arr[i] > biggest) {
				biggest = arr[i];
			}
		}
		return biggest;
	}
	
	public void isVowel(char a) {
		if(a == 65 || a == 69 || a == 73 || a == 79 || a == 85 || a == 97 || a == 101 || a == 105 || a == 109 || a == 111 || a == 117) {
			System.out.println("Vowel");
		}else {
			System.out.println("Not Vowel");
		}
	}
	public static void main (String[] args) {
		cogentday3 cogent = new cogentday3();
		cogent.printName();
		cogent.evenOrOdd(5);
		cogent.findBigger(6,7);
		cogent.swap(8,9);
		cogent.evenOrOddTernary(4);
		System.out.println(cogent.findBiggest(1,2,3));
		cogent.isVowel('a');
	}

}
