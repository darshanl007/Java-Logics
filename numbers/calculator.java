package numbers;

import java.util.Scanner;

public class calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the first number:");
		int a = sc.nextInt();

		System.out.println("Enter the Second number:");
		int b = sc.nextInt();

		System.out.println("Enter the operation:");
		char ch = sc.next().charAt(0);

		switch (ch) {
		case '+':
			System.out.println("Addition of two numbers is: " + (a + b));
			break;
		case '-':
			System.out.println("Subtraction of two numbers is: " + (a - b));
			break;
		case '*':
			System.out.println("Multiplication of two numbers is: " + (a * b));
			break;
		case '/':
			if (b == 0) {
				System.out.println("Dividing by zero");
			} else {
				System.out.println("Division of two numbers is : " + (a / b));
			}
		default: System.out.println("Enter valid operation ");
		}
	}
}
