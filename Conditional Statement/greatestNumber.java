//Take three numbers from the user and print the greatest number.


import java.util.Scanner;

public class demo {

    public static void main(String[] args) {
        int a = 25;
        int b = 78;
        int c = 87;
        double deno = b * b - (4 * a * c);
        if (a >= b) {
            if (a >= c) {
                System.out.println(a);
            } else {
                System.out.println(c);
            }
        }
        else {
            if(b >= c){
                System.out.println(b);
            }
            else {
                System.out.println(c);
            }
        }

        }
}
