//Write a Java program that takes three numbers as input to calculate and print the average of the numbers.

import java.util.Scanner;


public class demo{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int num1 = in.nextInt();
        System.out.println("Enter number 2: ");
        int num2 = in.nextInt();
        System.out.println("Enter number 3: ");
        int num3 = in.nextInt();
        System.out.println("Average: " + ((num1 + num2 + num3)/3));
    }
}
