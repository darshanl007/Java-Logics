package numbers;

import java.util.Scanner;

public class sumofnumber_to_singledigit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int no = sc.nextInt();
		while (no > 9) {
			no = sum(no);
		}
		System.out.println("Sum of number till getting single digit is : " + no);
	}

	static int sum(int no) {
		int sum = 0;
		while (no != 0) {
			int rem = no % 10;
			sum = sum + rem;
			no = no / 10;
		}
		return sum;
	}
}
