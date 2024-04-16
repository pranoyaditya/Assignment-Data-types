import java.util.Scanner;
import java.lang.Math;


public class OperationsOnNumber {
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
        System.out.printf("Sum : %.0f + %.0f = %.0f\n",first,second,(first+second));
        System.out.printf("Difference : %.0f - %.0f = %.0f\n",first,second,(first-second));
        System.out.printf("Product : %.0f X %.0f = %.2f\n",first,second,(first*second));
        System.out.printf("Average of %.0f and %.0f = %.2f\n",first,second,((first+second)/2));
        System.out.printf("Distance of %.0f and %.0f = %.0f\n",first,second,Math.abs(first-second));
        System.out.printf("Maximum is : %.0f\n",Math.max(first,second));
        System.out.printf("Minimum is : %.0f\n",Math.min(first,second));
    }
}
