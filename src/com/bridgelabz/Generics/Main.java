package com.bridgelabz.Generics;

public class Main {

	public static void main(String[] args) {
		System.out.println("Welcome to check Maximum of three variables");
		String x = "Sachin", y = "Mohit", z = "Akshay";
		Integer a = 30, b = 15, c = 55;
		Float p = 6.23f, q = 3.2f, r = 0.2f;
		TestMaximum.testMaximum(x, y, z);
		TestMaximum.testMaximum(a, b, c);
		TestMaximum.testMaximum(p, q, r);
	}
}