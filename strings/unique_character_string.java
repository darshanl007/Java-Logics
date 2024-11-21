package strings;

import java.util.Scanner;

public class unique_character_string {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String to check unique charcaters:");
		String str = sc.nextLine();

		for (int i = 0; i < str.length(); i++) {
			boolean flag = true;
			for (int j = 0; j < str.length(); j++) {
				if (i != j && str.charAt(i) == str.charAt(j)) {
					flag = false;
					break;
				}
			}
			if (flag) {
				System.out.print(str.charAt(i) + " ");
			}
		}
	}
}
