package numbers;

import java.util.Scanner;

public class area_of_circle {
	void area() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius:");
		int r = sc.nextInt();
		final double pi = 3.142;
		double result = pi * r * r;
		System.out.print("Area of circle : "+result);
	}

	public static void main(String[] args) {
		area_of_circle ac = new area_of_circle();
		ac.area();
	}
}
