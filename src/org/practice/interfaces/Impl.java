package org.practice.interfaces;

public class Impl implements Interface {

	@Override
	public void m1() {
		System.out.println("I am Method1");
		int m=1;
		System.out.println(m);
	}

	@Override
	public int m2() {
		System.out.println("I am Method2");
		return 2;
	}

	@Override
	public String m3() {
		System.out.println("I am Method3");
		return "Method3";
	}

	@Override
	public double m4(double x) {
		System.out.println("I am Method4");
		return x;
	}

	@Override
	public String m5(String y) {
		System.out.println("I am Method5");
		return "Method5";
	}
	
	public static void main(String[] args) {
		Impl impl = new Impl();
		impl.m1();
		int a=impl.m2();
		System.out.println(a);
		String b=impl.m3();
		System.out.println(b);
		double c=impl.m4(10);
		System.out.println(c);
		String d=impl.m5("hiiii");
		System.out.println(d);
		
	}

}
