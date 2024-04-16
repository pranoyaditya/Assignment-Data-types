import java.lang.Math;
import java.util.Scanner;

public class RectangleProperties {
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        // taking input from the user.
        double length,width;
        
        System.out.print("Enter length of the rectangle: ");
        length = sc.nextDouble();
        System.out.print("Enter width of the rectangle: ");
        width = sc.nextDouble();

        // Calculating area,perimeter and diagonal length.

        double area = (length*width);
        double perimeter = 2*(length+width);
        double diagonalLength = Math.sqrt( Math.pow(length,2) + Math.pow(width,2) );


        // Printing all the details asked in the problem statement.
        System.out.printf("Area:            %.2f\n",area);
        System.out.printf("Perimeter:       %.2f\n",perimeter);
        System.out.printf("Diagonal length: %.2f\n",diagonalLength);
    }
}
