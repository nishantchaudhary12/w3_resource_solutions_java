//Write a Java program to convert minutes into a number of years and days.


public class demo{
    public static void main(String[] args) {
        int minutes = 3456789;
        int years, days;
        days = minutes / 1440;
        years = days / 365;
        int rem_days = days - (years * 365);
        System.out.println("Years: " + years + " Days: " + rem_days);
        }
    }

