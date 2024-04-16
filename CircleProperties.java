import java.util.Scanner;
import java.lang.Math;

// E4.6

public class CircleProperties {
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        // taking radius input from the user.
        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();

        // declaring pi.
        double pi = (22.0/7.0);

        // calculating area, circumference, volume and surface of a sphere using given radius.

        double area = (pi*radius*radius);
        double circumference = 2*pi*radius;
        double volumeOfSphere = (4/3)*pi*radius*radius*radius;
        double surfaceAreaOfSphere = 4*pi*radius*radius;

        // printing the results.
        System.out.printf("Area of circle:              %.4f\n",area);
        System.out.printf("Circumference of circle:     %.4f\n",circumference);
        System.out.printf("Volume Of sphere:            %.4f\n",volumeOfSphere);
        System.out.printf("Surface area of sphere:      %.4f\n",surfaceAreaOfSphere);
    }

}
