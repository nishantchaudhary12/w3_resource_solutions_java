//Write a Java program to get a number from the user and print whether it is positive or negative.


import java.util.Scanner;

public class demo {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = in.nextInt();
        if (num > 0) {
            System.out.println("Positive");
        } else if (num < 0) {
            System.out.println("Negative");
        }
        else{
            System.out.println("Zero");
        }
    }
}