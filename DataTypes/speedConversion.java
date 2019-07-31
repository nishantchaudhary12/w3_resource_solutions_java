//Write a Java program to takes the user for a distance (in meters) and the time was taken (as three numbers:
// hours, minutes, seconds), and display the speed, in meters per second, kilometers per hour and miles per hour
// (hint: 1 mile = 1609 meters).


import java.util.Scanner;

public class demo {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter distance in meters: ");
        double distance = in.nextInt();
        System.out.println("Enter hours: ");
        double hours = in.nextInt();
        System.out.println("Enter minutes: ");
        double minutes = in.nextInt();
        System.out.println("Enter seconds: ");
        double seconds = in.nextInt();
        double totalSeconds = hours * 60 * 60 + minutes * 60 + seconds;
        double distPerSec = distance / totalSeconds;
        double kph = ( distance/1000.0f ) / ( totalSeconds/3600.0f );
        double mph = kph / 1.609f;
        System.out.println("Meters/second: " + distPerSec);
        System.out.println("Meters/hour: " + mph);
        System.out.println("Km/hour: " + kph);
        }
    }