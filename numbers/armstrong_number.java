//Sum of cubes of each digits is equal to the given number then it is called as Armstrong number.

package numbers;

import java.util.Scanner;

public class armstrong_number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int no = sc.nextInt();
		int x = findArmStrong(no);
		if (x == no) {
			System.out.println(x + " is ArmStrong Number");
		} else {
			System.out.println(x + " is not ArmStrong Number ");
		}
	}

	static int findArmStrong(int no) {
		int sum = 0;
		while (no != 0) {
			int rem = no % 10;
			sum += rem * rem * rem;
			no /= 10;
		}
		return sum;
	}
}
