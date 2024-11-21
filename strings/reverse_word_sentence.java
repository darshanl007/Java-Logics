package strings;

import java.util.Scanner;

public class reverse_word_sentence {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sentence to reverse a each word:");
		String str = sc.nextLine();
		String[] s1 = str.split(" ");
		for (int i = 0; i < s1.length; i++) {
			reverseString(s1[i]);
		}
	}

	static void reverseString(String str) {
		String rev = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		System.out.print(rev + " ");
	}
}
