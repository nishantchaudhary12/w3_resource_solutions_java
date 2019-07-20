//Write a Java program that accepts two integers from the user and then prints the sum, the difference, the product,
// the average, the distance (the difference between integer), the maximum (the larger of the two integers),
// the minimum (smaller of the two integers).


import java.util.Scanner;

public class demo{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input first number");
        int num1 = in.nextInt();
        System.out.println("Input second number");
        int num2 = in.nextInt();
        System.out.println("Sum: " + (num1 + num2));
        System.out.println("Difference: " + (num1 - num2));
        System.out.println("Product: " + (num1 * num2));
        System.out.println("Distance: " + Math.abs(num1 - num2));
        System.out.println("Maximum: " + Math.max(num1, num2));
        System.out.println("Minimum: " + Math.min(num1, num2));
        }
    }

