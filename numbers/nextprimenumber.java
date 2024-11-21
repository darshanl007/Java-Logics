package numbers;

import java.util.Scanner;

public class nextprimenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int no = sc.nextInt();
        for (int i = no + 1; i <= 100; i++) {
			boolean flag = true;
			for (int j = 2; j < no; j++) {
				if (i % j == 0) {
					flag = false;
					break;
				}
			}
			if (flag) {
				System.out.println(i + " is a prime number");
				break;
			}
		}
    }
}
