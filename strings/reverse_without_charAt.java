package strings;

import java.util.Scanner;

public class reverse_without_charAt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to reverse without using charAt() method:");
        String str = sc.nextLine();
        char[] ch = str.toCharArray();
        for(int i = ch.length-1;i>=0;i--){
            System.out.print(ch[i]+" ");
        }
    }
}
