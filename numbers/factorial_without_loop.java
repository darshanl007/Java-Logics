package numbers;

import java.util.Scanner;

public class factorial_without_loop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int no = sc.nextInt();
		int fact = factorial(no);
		System.out.println("Factorial of " + no + " is : " + fact);
	}

	static int factorial(int no) {
		if (no == 0) {
			return 1;
		} else {
			return no * factorial(no - 1);
		}
	}
}
