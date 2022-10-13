package com.bridgelabz.Generics;

public class Main {

	public static void main(String[] args) {
		System.out.println("Welcome to check max of three variables");
		String x = "Sachin", y = "Harshal", z = "Mohit", m = "Aman";
		Integer a = 30, b = 14, c = 74, d=65 ;
		Float p = 8.24f, q = 5.25f, r = 0.3f, s = 3.6f ;
		TestMaximum.<String>testMaximum(x, y, z, m);
		TestMaximum.<Integer>testMaximum(a, b, c, d);
		TestMaximum.<Float>testMaximum(p, q, r, s);
	}
}