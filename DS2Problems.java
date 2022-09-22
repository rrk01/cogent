package cogenttest;

import java.util.ArrayList;
import java.util.Scanner;

public class DS2Problems {
	public boolean isPrime(int n) { //DS2.1
		for(int i = 2; i < n/2; i ++) {
			if(n%i == 0) {
				return false;
			}
		}
		return true;
	}
	public void printPrimes(int max) { //DS2.2
		for(int i = 2; i <= max; i ++) {
			if(isPrime(i)) {
				System.out.println(i);
			}
		}
	}
	public void printFirstTenSum() { //DS2.3
		int sum = 0;
		for(int i = 1; i <= 10; i ++) {
			sum += i;
		}
		System.out.println(sum);
	}
	public void multiplicationTable() { //DS2.4
		System.out.println("Please enter an integer:");
		Scanner s = new Scanner(System.in);
		int userIn = s.nextInt();
		
		for(int i = 0; i <= 12; i ++) {
			System.out.println(userIn + " * " + i + " = " + (userIn * i));
		}
	}
	public int factorial(int n) { //DS2.5
		if(n == 0) {
			return 1;
		}else {
			return n * factorial(n - 1);
		}
	}
	public void exponent() { //DS2.6
		System.out.println("Please enter an integer base:");
		Scanner s = new Scanner(System.in);
		int userBase = s.nextInt();
		System.out.println("Please enter an integer exponent:");
		int userExp = s.nextInt();
		int result = userBase;
		
		if(userExp == 0) {
			System.out.println("1");
			return;
		}else if(userExp > 0) {
			for(int i = 1; i < userExp; i ++) {
				result *= userBase;
			}
		}else{
			System.out.println("Negative exponents are not supported in this version. Please delete system 32 and try again.");
			return;
		}
		
		System.out.println(result);
		
	}
	
	public void reverseInt() { //DS2.7
		System.out.println("Please enter an integer:");
		Scanner s = new Scanner(System.in);
		int userIn = s.nextInt();
		int aux = 0;
		while(userIn != 0) {
			int digitToReverse = userIn % 10;
			aux = aux * 10 + digitToReverse;
			userIn /= 10;
		}
		System.out.println(aux);
	}
	
	public void printSumEvensOdds(ArrayList<Integer> arr) { //DS2.8
		int sumEvens = 0;
		int sumOdds = 0;
		for(int i = 0; i < arr.size(); i ++) {
			if(arr.get(i) % 2 == 0) {
				sumEvens += arr.get(i);
			}else {
				sumOdds += arr.get(i);
			}
		}
		System.out.println("Sum of evens: " + sumEvens + "\nSum of odds: " + sumOdds);
	}
	
	public void isUserPrime() { //DS2.9
		System.out.println("Please enter an integer:");
		Scanner s = new Scanner(System.in);
		int userIn = s.nextInt();
		if(userIn < 0) {
			System.out.println("Please enter a positive number.");
			return;
		}else {
			System.out.println("Prime: " + isPrime(userIn));
		}
	}
	
	public void findGCD(int a, int b) { //DS2.11
		int gcd = 0;
		for(int i = 1; i <= a && i <= b;  i ++) {
			if(a%i == 0 && b%i == 0) {
				gcd = i;
			}
		}
		System.out.println("GCD of " + a + " & " + b + " = " + gcd);
	}
	
	public void addUserSums() { //DS2.12
		Scanner s = new Scanner(System.in);
		do {
			System.out.println("Please enter 2 integers to sum:");
			System.out.println(s.nextInt() + s.nextInt());
			System.out.println("If you would like to quit, please type 'quit'. Otherwise, press any key to continue.");
		}while(s.next() != "quit");
	}
	
	public void userArrayPolarities() { //DS2.13 - Incomplete
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter a series of integers. Type 'quit' to quit.");
		int positives = 0;
		int negatives = 0;
		int zeroes = -1;
		do {
			if(s.nextInt() > 0) {
				positives ++;
			}else if(s.nextInt() < 0) {
				negatives ++;
			}else {
				zeroes ++;
			}
		}
		while(s.next() != "quit");
			
		System.out.println("Positives: " + positives);
		System.out.println("Negatives: " + negatives);
		System.out.println("Zeroes: " + zeroes);
	}
	
	public void userLargestSmallest() { //DS2.14 - Incomplete
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter a series of integers. Type 'quit' to quit.");
		int smallest = Integer.MAX_VALUE;
		int largest = Integer.MIN_VALUE;
		int temp = 0;
		do {
			temp = s.nextInt();
			if(temp > largest) {
				largest = temp;
			}else if(temp < smallest) {
				smallest = temp;
			}
		}
		while(s.next() != "quit");
	}
	
	public void armstrongNumbers() { //DS2.15
		int armstrongSum;
		int n;
		for(int i = 10; i <= 500; i ++) {
			armstrongSum = 0;
			n = i;
			while(n != 0) {
				armstrongSum += (n%10)*(n%10)*(n%10);
				n /= 10;
			}
			if(armstrongSum == i) {
				System.out.println(i);
			}
		}
	}
	
	public int fibonacci(int n) { //DS2.16
		if(n <= 1) {
			return n;
		}else{
			return fibonacci(n - 1) + fibonacci(n - 2);
		}
	}
	
	public double harmonicSum(int n) { //DS2.17
		double a = 0;
		for(int i = 1; i <= n; i ++) {
			a += (double)1/i;
		}
		return a;
	}
	
	public double ln2Estimate(int n) { //DS2.18
		double a = 0;
		for(int i = 1; i <= n; i ++) {
			a = i%2 == 0 ? a - (double)1/i : a + (double)1/i;
		}
		return a;
	}
	
	public void guessTheNumber() { //DS2.19
		Scanner s = new Scanner(System.in);
		int numberToGuess = (int)(Math.random()*100);
		System.out.println("Please guess a number:");
		while(true) {
			int userGuess = s.nextInt();
			if(userGuess > numberToGuess) {
				System.out.println("Too high. Try again.");
			}else if(userGuess < numberToGuess) {
				System.out.println("Too low. Try again.");
			}else {
				System.out.println("Congratulations, you're correct!");
				break;
			}
		}
		
	}

	public static void main(String[] args) {
		DS2Problems asdf = new DS2Problems();
		//System.out.println(asdf.isPrime(39));
		//asdf.printPrimes(30);
		//asdf.printFirstTenSum();
		//asdf.multiplicationTable();
		//System.out.println(asdf.factorial(3));
		//asdf.exponent();
		//asdf.reverseInt();
		/*
		ArrayList<Integer> lkj = new ArrayList<Integer>();
		for(int i = 0; i < 10; i ++) {
			lkj.add(i);
		}
		asdf.printSumEvensOdds(lkj);
		*/
		//asdf.isUserPrime();
		//asdf.findGCD(100, 10);
		//asdf.addUserSums();
		//asdf.userArrayPolarities();
		//asdf.userLargestSmallest();
		//asdf.armstrongNumbers();
		/*
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter the number of terms of the fibonacci series to print:");
		int userFib = s.nextInt();
		for(int i = 0; i < userFib; i ++) {
			System.out.println(asdf.fibonacci(i));
		}
		*/
		//System.out.println(asdf.harmonicSum(7));
		//System.out.println(asdf.ln2Estimate(2));
		asdf.guessTheNumber();
	}
	

}
