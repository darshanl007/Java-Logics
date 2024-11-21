//Sum of square of each number till getting single digit is equals to 1 or 7 is called as Happy number.

package numbers;

import java.util.Scanner;

public class happy_number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int no = sc.nextInt();
        int n = no;
		while (no > 9) {
			no = squareSum(no);
		}
		if (no == 1 || no == 7) {
			System.out.println(n + " is a happy number");
		} else {
			System.out.println(n + " is not a happy number");
		}
	}

	static int squareSum(int no) {
		int sum = 0;
		while (no != 0) {
			int rem = no % 10;
			sum = sum + (rem * rem);
			no = no / 10;
		}
		return sum;
	}
}
