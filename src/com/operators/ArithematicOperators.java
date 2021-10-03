package com.operators;

public class ArithematicOperators {

	public static void main(String[] args) {
		int a = 100;
		int b = 45;
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a / b);
		System.out.println(a * b);
		System.out.println(a % b);

		System.out.println(111 << 2);
		System.out.println(2 << 3);

		System.out.println(10 >> 3);
		System.out.println(100 >> 3);
		
		
		System.out.println(a>b && b>a); //TT=T
		System.out.println(a<b || b<a); //FF =F
		
		
	}

}
