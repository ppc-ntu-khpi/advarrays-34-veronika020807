import logic.Matrix;
import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        final int rows = 4;
        final int cols = 5;
        final int maxValue = 20;

        int[][] matrix = generateRandomMatrix(rows, cols, maxValue);

        // Вивід матриці
        System.out.println("Матриця:");
        for (int i = 0; i < matrix.length; i++) {
            System.out.println("Рядок " + (i + 1) + ": " + Arrays.toString(matrix[i]));
        }

        // Перевірка методу
        int maxColIndex = Matrix.findColumnWithMaxSum(matrix);
        System.out.println("\nСтовпець з максимальною сумою має індекс (з 0): " + maxColIndex);
    }

    // Метод генерації випадкової матриці
    private static int[][] generateRandomMatrix(int rows, int cols, int maxValue) {
        Random rand = new Random();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                matrix[i][j] = rand.nextInt(maxValue + 1);
        return matrix;
    }
}
