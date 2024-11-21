package numbers;

import java.util.Scanner;

public class large_3nums {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the first number:");
		int a = sc.nextInt();

		System.out.println("Enter the second number:");
		int b = sc.nextInt();

		System.out.println("Enter the third number:");
		int c = sc.nextInt();

		if (a >= b && a >= c) {
			System.out.println(a + " is larger number");
		} else if (b >= c) {
			System.out.println(b + " is larger number");
		} else {
			System.out.println(c + " is larger number");
		}
	}
}
