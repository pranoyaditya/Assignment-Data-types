import java.lang.Math;

public class PropertiesOfPaper
{
    public static void main(String args[])
    {
        // Height and width of letter size in inch given in the problem statement.
        double height = 8.5;
        double width = 11;

        // Calculated height and width of letter in Milimeters.
        double heightInMilimeter = (8.5*25.4);
        double widthInMilimeter = (11*25.4);

        // Calculated perimeter of the paper in Milimeters.
        double perimeter = 2*(heightInMilimeter+widthInMilimeter);

        // Calculated diagonal length of the paper in Milimeters.
        double diagonalLength = Math.sqrt( Math.pow(heightInMilimeter,2) + Math.pow(widthInMilimeter,2) );


        // Printing all the details asked in the problem statement.
        System.out.printf("Height in Milimeters : %.2f\n",heightInMilimeter);
        System.out.printf("Width in Milimeters : %.2f\n",widthInMilimeter);
        System.out.printf("Perimeter of the paper in Milimeters: %.2f\n",perimeter);
        System.out.printf("Diagonal length of the paper in Milimeters : %.2f\n",diagonalLength);

    }
}