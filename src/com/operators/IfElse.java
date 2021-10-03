package com.operators;

public class IfElse {

	public static void main(String[] args) {
		 int a = 10;
		 int b = 5;
		 int c= 15;
		 String s = "sue";
		 boolean n =s.contains("u");
		 System.out.println(n);
		 if (a>c && a>b )
		 {
			 System.out.println("if a is greather than b and c then a is highest");
		 }
		 else if (b>a && b>c) {
			 System.out.println("if b is greather than a and c then b is highest");
		 }
		 
		 else {
			 System.out.println("c is the highest");
		 }
		 
		 if (a<b || a>c) {
			 System.out.println("a value is " +a);
			
		 }
	
		 else { 
			 System.out.println("else block");
		 }
	}
	
	
	

}
