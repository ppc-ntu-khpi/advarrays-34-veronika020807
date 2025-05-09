package logic;

public class Matrix {

    // Пошук індексу стовпця з максимальною сумою елементів
    public static int findColumnWithMaxSum(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            throw new IllegalArgumentException("Матриця не може бути порожньою.");
        }

        int maxSum = Integer.MIN_VALUE;
        int maxIndex = -1;

        for (int col = 0; col < matrix[0].length; col++) {
            int sum = 0;
            for (int row = 0; row < matrix.length; row++) {
                sum += matrix[row][col];
            }
            if (sum > maxSum) {
                maxSum = sum;
                maxIndex = col;
            }
        }

        return maxIndex;
    }
}
