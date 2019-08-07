//Write a Java program to solve quadratic equations (use if, else if and else).


import java.util.Scanner;

public class demo {

    public static void main(String[] args) {
        double a = 1d;
        double b = 5d;
        double c = 2d;
        double deno = b * b - (4 * a * c);
        if (deno > 0){
            double r1 = (-b + Math.pow(deno, 0.5))/(2 * a);
            double r2 = (-b - Math.pow(deno, 0.5))/(2 * a);
            System.out.println("Roots: " + r1 + " and " + r2);
        }
        else if (deno == 0){
            double r1 = -b / (2 * a);
            System.out.println("Root: " + r1);
        }
        else{
            System.out.println("No real roots");
        }
    }
}
