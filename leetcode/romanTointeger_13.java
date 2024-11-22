package LeetCode;

import java.util.Scanner;

public class romanTointeger_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Roman numeral to convert integer:");
        String s = sc.nextLine();
        int result = romanToint(s);
        System.out.println("The integer value of Roman numeral is : "+result);
    }

    static int romanToint(String s){
        char[] ch = s.toCharArray();
        int count = 0;

        for(int i=0;i<ch.length-1;i++){
            int current = getRomanValue(ch[i]);
         int next = getRomanValue(ch[i + 1]);
        if (current < next) {
            count -= current; // Subtract if the current value is smaller
        } else {
            count += current; // Add if the current value is greater or equal
        }
    }
    // Add the Value of the last character  
    count += getRomanValue(ch[ch.length - 1]);
    return count;

    }

    static int getRomanValue(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
}
