package com.operators;

public class OperatorsJava {

	public static void main(String[] args) {
		/*
		 * Operators Going to create
		 */
		int y = 5;
		int x = 7;
		float s = 3F;

		System.out.println((y++) + " y value is" + y);

		System.out.println(++y);

		System.out.println(y--);

		System.out.println(--y);

		System.out.println("y value is " + y);
		y++;

		System.out.println("y value is" + y);

		System.out.println("postfix value " + y);

		System.out.println("y value is " + y);
		++y;
		System.out.println("prefix " + y);

		System.out.println(x++);
		System.out.println(++x);

		System.out.println(s--);
		// System.out.println(s=s-1);
		System.out.println(--s);
		System.out.println(s);
		System.out.println(s = s / 2 + 3);
		System.out.println(s);

		System.out.println((s + 3) / 2);

		System.out.println(x % y);
	}

}
