//Write a Java program that reads a floating-point number and prints "zero" if the number is zero. Otherwise,
// print "positive" or "negative". Add "small" if the absolute value of the number is less than 1, or "large" if it exceeds 1,000,000.


import java.util.Scanner;

public class demo {

    public static void main(String[] args) {
        float a = 25f;
        if(a > 0){
            if(a > 1000000){
                System.out.println("Large positive number");
            }
            else if(a < 1){
                System.out.println("Small positive number");
            }
            else {
                System.out.println("Positive number");
            }
        }
        else if (a < 0){
            if(Math.abs(a) > 1000000){
                System.out.println("Large negative number");
            }
            else if(Math.abs(a) < 1){
                System.out.println("Small negative number");
            }
            else {
                System.out.println("Negative number");
            }
        }
        else {
            System.out.println("Zero");
        }
    }
}
