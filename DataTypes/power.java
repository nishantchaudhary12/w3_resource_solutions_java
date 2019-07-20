//Write a Java program that reads a number and display the square, cube, and fourth power.


import java.util.Scanner;

public class demo{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input number");
        int num = in.nextInt();
        System.out.println("Square: " + Math.pow(num, 2));
        System.out.println("Cube: " + Math.pow(num, 3));
        System.out.println("Fourth Power: " + Math.pow(num, 4));
        }
    }

