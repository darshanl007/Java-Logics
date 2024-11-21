package numbers;

import java.util.Scanner;

public class primenumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int no = sc.nextInt();
        boolean flag = true;
		for (int i = 2; i < no; i++) {
			if (no % i == 0) {
				flag = false;
				break;
			}
		}
		if (flag) {
			System.out.println(no + " is a prime number");
		} else {
			System.out.println(no + " is not a prime number");
		}
    }
}