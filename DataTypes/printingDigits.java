//Write a Java program to break an integer into a sequence of individual digits.


public class demo{
    public static void main(String[] args) {
        int number = 123456;
        int len = Integer.toString(number).length();
        int ar[] = new int[len];
        System.out.println();
        for (int i=0; i<len; i++) {
            ar[i] = (number % 10);
            number = number / 10;
            }
        for (int i=len-1; i>=0; i--){
            System.out.println(ar[i]);
        }
        }
    }

