package  strings;

import java.util.Scanner;

public class reverse_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String to reverse:");
        String str = sc.nextLine();
        String reverse = "";
        for(int i=str.length()-1;i>=0;i--){
            reverse = reverse+str.charAt(i);
        }
        System.out.println("Reversed String is : "+reverse);
    }
}
