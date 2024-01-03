package org.practice;

public class Test1 {

	public static void main(String[] args) {
		
		int result1=10;
		System.out.println(result1);
		result1++;
		System.out.println(result1);
		++result1;
		System.out.println(result1);
		
		int result2=20;
		int result3=30;
		int result4=40;
		 result1=add(10,70);
		System.out.println("result1 = "+result1);
		 result2=sub(40,90);
		System.out.println("result2 = "+result2);
		 result3=mul(result1, result2);
		System.out.println("result3 = "+result3);
		 result4=div(result3, result1);
		System.out.println("result4 = "+result4);

	}

	
	
	public static int add(int x,int y) {
		System.out.println("I am Addition");
		return  x+y;
	}
	
	
	public static int sub(int x,int y) {
		System.out.println("I am Subtraction");
		return x-y;
	}
	
	
	public static int mul(int x,int y) {
		System.out.println("I am Multiplication");
		return x*y;
	}
	
	public static int div(int x,int y) {
		System.out.println("I am Division");
		return x/y;
		
	}
	
}
