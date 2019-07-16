// Write a Java program that takes two numbers as input and display the product of two numbers.

import java.util.Scanner;

public class demo{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input first number");
        int num1 = in.nextInt();
        System.out.println("Input second number");
        int num2 = in.nextInt();
        System.out.println("Product " + num1 * num2);
    }
}
