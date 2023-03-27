import java.util.Scanner;

public class Symmetric {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix = new int[20][20];
        int[][] transpose = new int[20][20];
        int r, c, i, j, flag = 0;

        System.out.println("Enter the rows of matrix:");
        r = sc.nextInt();
        System.out.println("Enter the columns of matrix:");
        c = sc.nextInt();

        if (r == c) {
            System.out.println("Enter the Matrix");
            for (i = 0; i < r; i++) {
                for (j = 0; j < c; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }

            System.out.println("The matrix is");
            for (i = 0; i < r; i++) {

                for (j = 0; j < c; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }

            for (i = 0; i < r; i++) {
                for (j = 0; j < c; j++) {
                    transpose[j][i] = matrix[i][j];
                }
            }

            for (i = 0; i < r; i++) {
                for (j = 0; j < c; j++) {
                    if (matrix[i][j] != transpose[i][j]) {
                        flag = 1;
                        break;
                    }
                }
            }

            if (flag == 1) {
                System.out.println("The matrix is not symmetric");
            }

            else {
                System.out.println("The matrix is symmetric");
            }
        } else {
            System.out.println("Unable to determine");
        }
    }
}