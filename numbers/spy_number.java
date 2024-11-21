//A number is spy if the sum of its digits equals the product of its digits.

package numbers;

import java.util.Scanner;

public class spy_number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int no = sc.nextInt();

		int orgNo = no;
		int sum = 0;
		int prod = 1;

		while (no > 0) {
			int rem = no % 10;
			sum += rem;
			prod *= rem;
			no /= 10;
		}

		if (sum == prod) {
			System.out.println(orgNo + " is Spy Number");
		} else {
			System.out.println(orgNo + " is not Spy Number");
		}
	}
}
