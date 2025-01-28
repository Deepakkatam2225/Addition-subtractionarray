import java.util.Scanner;

public class Additionsubtractionrray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input dimensions of the matrices
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();

        // Initialize the matrices
        int[][] matrix1 = new int[rows][cols];
        int[][] matrix2 = new int[rows][cols];
        int[][] additionResult = new int[rows][cols];
        int[][] subtractionResult = new int[rows][cols];

        // Input first matrix
        System.out.println("Enter elements of the first matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                matrix1[i][j] = scanner.nextInt();
            }
        }

        // Input second matrix
        System.out.println("Enter elements of the second matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                matrix2[i][j] = scanner.nextInt();
            }
        }

        // Perform addition and subtraction
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                additionResult[i][j] = matrix1[i][j] + matrix2[i][j];
                subtractionResult[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }

        // Display the results
        System.out.println("Result of matrix addition:");
        displayMatrix(additionResult);

        System.out.println("Result of matrix subtraction:");
        displayMatrix(subtractionResult);

        scanner.close();
    }

    // Method to display a matrix
    private static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
