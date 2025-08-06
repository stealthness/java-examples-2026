package recursion;

public class PrintTriangleExample {

    public static void main(String[] args) {
        System.out.println("Using loops:");
        printTriangleLoop(5);
        System.out.println("Using recursion:");
        printTriangleRecursion(5);
    }

    /**
     * Prints a triangle pattern using recursion.
     * @param n the number of rows in the triangle
     */
    private static void printTriangleRecursion(int n) {
        // Base case: if n is 0, do nothing
        // This will stop the recursion when there are no more rows to print
        if (n == 0) {
            return;
        }
        printTriangleRecursion(n-1);
        // Print the current row after the recursive call
        // This ensures that the rows are printed in the correct order
        for (int i = 1; i <= n; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    /**
     * Prints a triangle pattern using loops.
     * @param n the number of rows in the triangle
     */
    private static void printTriangleLoop(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
