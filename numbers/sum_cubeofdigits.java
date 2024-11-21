package numbers;

import java.util.Scanner;

public class sum_cubeofdigits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int no = sc.nextInt();
		int sum = 0;
		while (no != 0) {
			int rem = no % 10;
			sum = sum + (rem * rem * rem);
			no = no / 10;
		}
		System.out.println("Sum of Cube of number is " + sum);
	}
}
