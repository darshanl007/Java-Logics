//A Strong number is a special number in which the sum of the factorials of its digits is equal to the number itself.

package numbers;

import java.util.Scanner;

public class strong_number {
	public static void main(String[] args) {
		findStrong();
	}

	static void findStrong() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int no = sc.nextInt();
		int temp = no;
		int sum = 0;
		while (no != 0) {
			int rem = no % 10;
			sum += findFact(rem);
			no /= 10;
		}
		if (sum == temp) {
			System.out.println(sum + " is a Strong Number");
		} else {
			System.out.println(sum + " is not a Strong Number");
		}
	}

	static int findFact(int no) {
		int fact = 1;
		for (int i = no; i >= 1; i--) {
			fact = fact * i;
		}
		return fact;
	}
}
