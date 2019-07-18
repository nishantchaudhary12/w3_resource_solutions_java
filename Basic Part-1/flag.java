//Write a Java program to print an American flag on the screen.


public class demo{
    public static void main(String[] args) {
        for (int i=0; i<15; i++) {
            if (i<10){
                    if((i%2)==0)
                        System.out.println("* * * * * * ===========================================");
                    else
                        System.out.println(" * * * * *  ===========================================");
            }
            else
                System.out.println("=======================================================");
        }
    }
}
