//Write a Java program to compute body mass index (BMI).


public class demo{
    public static void main(String[] args) {
        double weight = 452;  //pounds
        double height = 72; //inches
        double BMI = weight * 0.45359237 / (height * 0.0254 * height * 0.0254);
        System.out.println("BMI: " + BMI);
        }
    }

