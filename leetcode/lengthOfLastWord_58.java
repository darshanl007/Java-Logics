package LeetCode;

import java.util.Scanner;

public class lengthOfLastWord_58 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String to find length of last word:");
        String str = sc.nextLine();
        int result = lengthOfLastWord(str);
        System.out.println("Length of the last word is : "+result);
    }
    static int lengthOfLastWord(String s) {
        boolean flag = false;
        int length = 0;
        for(int i=s.length()-1;i>=0;i--){
            char ch = s.charAt(i);
            if(ch!=' '){
                flag = true;
                length++;
            } else if(ch==' ' && flag == true) {
                break;
            }
        }
        return length;
    }
}