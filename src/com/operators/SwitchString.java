package com.operators;

public class SwitchString {

	public static void main(String[] args) {
		String name = "mymnz";
		int count= 0; 
		System.out.println(name.charAt(0));
		System.out.println(name.charAt(1));
		System.out.println(name.charAt(2));
		System.out.println(name.charAt(3));
		System.out.println(name.charAt(4));
		System.out.println("Length "+name.length());
	//if statement
		for(int i=0; i<name.length(); i++) {
		if (name.charAt(i)=='a') {
			count=count+1;
		}
		if (name.charAt(i)=='e') {
			count=count+1;
		}
		if (name.charAt(i)=='i') {
			count=count+1;
		}
		if (name.charAt(i)=='o') {
			count=count+1;
		}
		if (name.charAt(i)=='u') {
			count=count+1;
		}
		}
		if(count==0) {
		System.out.println("Consonant");
		}
		System.out.println("vowel count "+count);
	}
}
