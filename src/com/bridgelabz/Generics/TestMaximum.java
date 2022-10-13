package com.bridgelabz.Generics;

public class TestMaximum {

	int x, y, z;

	// constructor
	public TestMaximum(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	// checking max of three integers
	public static Integer testMaximum(Integer x, Integer y, Integer z) {
		Integer max = x;// Initializing x as greater
		if (y.compareTo(max) > 0)
			max = y;// as of now y is greater

		if (z.compareTo(max) > 0)
			max = z;// now z is greater
		printMax(x, y, z, max);
		return max;

	}

	public static void printMax(Integer x, Integer y, Integer z, Integer max) {
		System.out.printf("the max of %s , %s and %s is %s\n", x, y, z, max);

	}

}