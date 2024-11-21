package numbers;

import java.util.Scanner;

public class area_of_square {
    static void area(int side){
        int aos = side*side;
        System.out.println("Area of square is : "+aos);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the area:");
        int a = sc.nextInt();
        area(a);
    }
}
