package part1;

/**
 * This class is the driver class for the Point class.
 * It is used to test the functionality of the Point class.
 *
 * In this file will contain the Point class, which will be accessed by the driver class.
 *
 * @author stealthness
 */
public class PointDriverClass {

    public static void main(String[] args) {

        // Question 1: Create a Point object and set its coordinates to (5.0, 10.0).
        question1();

        // Question 2: Read in a point from the user and print its coordinates.
        question2();

        // Note: The Point class is defined below this main method.
    }

    /**
     * Question 1 create a Point object and set its coordinates to (5.0, 10.0).
     */
    static void question1(){
        // Create a new Point object
        Point point = new Point();

        // Set the coordinates of the point
        point.x = 5.0;
        point.y = 10.0;

        // Print the coordinates of the point
        System.out.println("Point coordinates: (" + point.x + ", " + point.y + ")");
    }

    static void question2(){
        // Read in a point from the user
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter x coordinate: ");
        double inputX = scanner.nextDouble();
        System.out.print("Enter y coordinate: ");
        double inputY = scanner.nextDouble();
        // At this stage we are not verifying that the user has entered a valid point

        // Create a new Point object
        Point point = new Point();
        point.x = inputX;
        point.y = inputY;

        // Print the coordinates of the point
        System.out.println("Point coordinates: (" + point.x + ", " + point.y + ")");
    }
}

/**
 * This class represents a point in a 2D space.
 * It contains two fields: x and y, which represent the coordinates of the point.
 * Both points can be accessed and modified directly as they are contained in the same
 * package, we will lean more about packages later.
 *
 * @author stealthness
 */
class Point {
    double x;
    double y;
}
