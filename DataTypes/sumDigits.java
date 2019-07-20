//Write a Java program that reads an integer between 0 and 1000 and adds all the digits in the integer.


public class demo{
    public static void main(String[] args) {
        int number = 555;
        int new_num = 0;
        while (number > 0){
            new_num += (number % 10);
            number /= 10;
            }
        System.out.println("Sum: " + new_num);
        }
    }

