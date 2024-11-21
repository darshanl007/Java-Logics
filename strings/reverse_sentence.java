package strings;

import java.util.Scanner;

public class reverse_sentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Sentence to reverse:");
        String str = sc.nextLine();
        String[] s1 = str.split(" ");
        for(int i=s1.length-1;i>=0;i--){
            System.out.print(s1[i]+" ");
        }
    }
}
