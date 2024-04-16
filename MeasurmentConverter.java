import java.util.Scanner;


public class MeasurmentConverter {
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        double measure;

        // converting measuresments. 1 meter to miles,feets and inches.
        double toMiles = 0.000621371;
        double toFeet = 3.28084;
        double toInch = 39.3701;

        // taking input from the user.
        System.out.print("Enter measurement in meters: ");
        measure = sc.nextDouble();

        // printing results
        System.out.printf("Measurement in Miles :  %.8f\n",(measure*toMiles));        
        System.out.printf("Measurement in Feets :  %.8f\n",(measure*toFeet));        
        System.out.printf("Measurement in Inches : %.8f\n",(measure*toInch));        


    }
}
