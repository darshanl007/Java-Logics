package numbers;

import java.util.Scanner;

public class reverse_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be reversed:");
        int no = sc.nextInt();

        while(no!=0){
            int rem=no%10;
            System.out.print(rem+" ");
            no =no/10;
        }
    }
}
