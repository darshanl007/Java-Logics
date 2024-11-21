package numbers;

import java.util.Scanner;

public class check_palindrome {
	static boolean checkPalindrome(int no) {
		int reverse = 0;
		int temp = no;
		while (temp > 0) {
			int rem = temp % 10;
			reverse = (reverse * 10) + rem;
			temp /= 10;
		}
		if (no == reverse) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int no = sc.nextInt();

		if (checkPalindrome(no)) {
			System.out.println(no + " is a Palindrome");
		} else {
			System.out.println(no + " is not a Palindrome");
		}
	}
}
