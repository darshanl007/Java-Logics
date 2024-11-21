package numbers;

import java.util.Scanner;

public class IT_Calci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the tax amount in lakhs:");
		int a = sc.nextInt();

		int tax;

		if (a < 500000) {
			tax = 0;
			System.out.println("You don't need to pay any tax");
		} else if (a >= 500000 && a < 1000000) {
			tax = (int) (a * 0.2);
			System.out.println("You sholud pay the tax of rupees : " + tax);
		} else {
			tax = (int) (a * 0.3);
			System.out.println("You sholud pay the tax of rupees : " + tax);
		}
	}
}
