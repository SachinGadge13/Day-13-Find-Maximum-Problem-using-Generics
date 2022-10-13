package com.bridgelabz.Generics;

public class Main {

	public static void main(String[] args) {
		System.out.println("Welcome to Check maximum of three variables");
		String x = "Sachin", y = "Harshal", z = "Amit";
		Integer a = 20, b = 35, c = 15;
		Float p = 6.23f, q = 2.2f, r = 5.2f;
		TestMaximum.<String>testMaximum(x, y, z);
		TestMaximum.<Integer>testMaximum(a, b, c);
		TestMaximum.<Float>testMaximum(p, q, r);
	}
}