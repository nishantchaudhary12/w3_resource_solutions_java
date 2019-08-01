//Write a Java program to convert a decimal number to binary number.


import java.util.Scanner;


public class demo {

    public static void main(String[] args) {
        int num = 4;
        String result = "";    //can also be done with arrays, append the remainder in array and then print the array in reverse order
        int rem = 0;
        while (num > 0){
            rem = num % 2;
            result += rem;
            num = num / 2;
        }
        System.out.println(result);
        String newResult = "";
        for (int i=result.length()-1; i>=0; i--){
            newResult += result.charAt(i);
        }
        System.out.println(newResult);
    }
}
