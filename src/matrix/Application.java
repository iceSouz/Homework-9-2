package matrix;

import java.util.Arrays;

public class Application {
    public static final int LENGTH = 8;
    public static final int WIDTH = 8;


    public static void main(String[] args) {
        int[][] matrix = new int[LENGTH][WIDTH];

        matrixData(matrix);
        printMatrix(matrix);
    }

    public static void matrixData(int[][] matrix) {
        for (int i = 0; i < LENGTH; i++) {
            for (int j = 0, c = WIDTH; j < WIDTH; j++, c--) {
                if (i % 2 == 0) {
                    matrix[i][j] = j + 1;
                } else {
                    matrix[i][j] = c;
                }
            }
        }
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < LENGTH; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }
}
