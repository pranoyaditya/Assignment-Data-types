import java.util.Scanner;
import java.lang.Math;

public class PlayingWithNumber 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        // decalring a variable to read input from the user.
        double number;
        
        // Prompt for the user to input a number.
        System.out.print("Enter a number : ");

        // storing the given input.
        number = sc.nextDouble();

        // calculating square of the given number.
        double squareNumber = Math.pow(number,2);

        // calculating cube of the given number.
        double cubeNumber = Math.pow(number,3);

        // calculating fourth of the given number.
        double fourthNumber = Math.pow(number,4);

        // printing results
        System.out.printf("Square of %.0f : %.0f\n",number,squareNumber);
        System.out.printf("Cube of %.0f : %.0f\n",number,cubeNumber);
        System.out.printf("Fourth of %.0f : %.0f\n",number,fourthNumber);


    }
}
