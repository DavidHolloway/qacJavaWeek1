package com.qac.day1;

public class Runner {

	// This is single line comment
	/*
	 * This is a Multi-line comment
	 */
	public static void main(String[] args) {

		int age = 21;
		int height = 180;
		String fName = "David";
		Boolean bool = true;
		System.out.println("Hello World");
		System.out.println("Second line of text");
		if (bool == true) {
			System.out.println(fName + " is " + age + " years old\nand " + height + " cm tall.");
		} else {
			System.out.println("No users found");
		}
		
	}

}
