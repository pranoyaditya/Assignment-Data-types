import java.util.Scanner;
import java.lang.Math;

public class EnhanceOperationOnNumber {

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        // declaring two variables.
        double first,second;

        // taking input
        System.out.print("Enter first number : ");
        first = sc.nextDouble();
        System.out.print("Enter second number : ");
        second = sc.nextDouble();

        // printing results which were asked in the problem.
        System.out.printf("Sum:            %.0f\n",(first+second));
        System.out.printf("Difference:     %.0f\n",(first-second));
        System.out.printf("Product:        %.0f\n",(first*second));
        System.out.printf("Average:        %.2f\n",((first+second)/2));
        System.out.printf("Distance:       %.0f\n",Math.abs(first-second));
        System.out.printf("Maximum:        %.0f\n",Math.max(first,second));
        System.out.printf("Minimum:        %.0f\n",Math.min(first,second));
    }
}
