package cogenttest;

import java.util.Scanner;

class Person {
	private int id;
	private String name;
	
	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "ID: " + this.id + " | NAME: " + this.name;
	}
	
}

public class StringQuestions {
	
	public static String reverse(String str) {
		if(str == null || str.equals(""))
            return "";
        
		String reversed = "";
        String[] words = str.split(" ");
        
        for(int i = words.length - 1; i >= 0; i --) {
        	reversed += words[i] + " ";
        }
        
        return reversed;
        
	}
	
	public static void main(String[] args) {
		//System.out.println(reverse("Jelly Belly Pet Rat"));
		
		/*
		Person[] arr = {new Person(1,"A"), new Person(2,"B"), new Person(3,"c"), new Person(4,"d"), new Person(5,"e"), new Person(6,"f"),
				new Person(7,"g"), new Person(8,"h"), new Person(9,"i"), new Person(10,"j")};
		
		for(Person i : arr)
			if(i.getName().charAt(0) == 'a' || i.getName().charAt(0) == 'A' || i.getName().charAt(0) == 'j' || i.getName().charAt(0) == 'J')
				System.out.println(i);
				
		*/
		
		/*
		Scanner s = new Scanner(System.in);
		
		try {
			s.nextInt();
			System.out.println("User input is an int.");
		}catch(Exception e) {
			System.out.println("User input is not an int.");
		}
		*/
		
		
	}

}
