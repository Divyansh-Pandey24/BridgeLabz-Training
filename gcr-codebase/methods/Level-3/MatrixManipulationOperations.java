public class MatrixManipulationOperations {

    // Method to create a random matrix
    public static double[][] createMatrix(int rows, int cols) {
        double[][] matrix = new double[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = (int)(Math.random() * 9) + 1; // 1 to 9
            }
        }
        return matrix;
    }

    // Method to find transpose of a matrix
    public static double[][] transpose(double[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        double[][] result = new double[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[j][i] = matrix[i][j];
            }
        }
        return result;
    }

    // Method to find determinant of 2x2 matrix
    public static double determinant2x2(double[][] m) {
        return (m[0][0] * m[1][1]) - (m[0][1] * m[1][0]);
    }

    // Method to find determinant of 3x3 matrix
    public static double determinant3x3(double[][] m) {
        return m[0][0] * (m[1][1] * m[2][2] - m[1][2] * m[2][1])
             - m[0][1] * (m[1][0] * m[2][2] - m[1][2] * m[2][0])
             + m[0][2] * (m[1][0] * m[2][1] - m[1][1] * m[2][0]);
    }

    // Method to find inverse of 2x2 matrix
    public static double[][] inverse2x2(double[][] m) {
        double det = determinant2x2(m);
        double[][] inv = new double[2][2];
        if (det == 0) {
            System.out.println("Inverse not possible (Determinant is zero)");
            return null;
        }
        inv[0][0] =  m[1][1] / det;
        inv[0][1] = -m[0][1] / det;
        inv[1][0] = -m[1][0] / det;
        inv[1][1] =  m[0][0] / det;

        return inv;
    }

    // Method to find inverse of 3x3 matrix
    public static double[][] inverse3x3(double[][] m) {
        double det = determinant3x3(m);
        if (det == 0) {
            System.out.println("Inverse not possible (Determinant is zero)");
            return null;
        }

        double[][] inv = new double[3][3];
        inv[0][0] =  (m[1][1]*m[2][2] - m[1][2]*m[2][1]) / det;
        inv[0][1] = -(m[0][1]*m[2][2] - m[0][2]*m[2][1]) / det;
        inv[0][2] =  (m[0][1]*m[1][2] - m[0][2]*m[1][1]) / det;

        inv[1][0] = -(m[1][0]*m[2][2] - m[1][2]*m[2][0]) / det;
        inv[1][1] =  (m[0][0]*m[2][2] - m[0][2]*m[2][0]) / det;
        inv[1][2] = -(m[0][0]*m[1][2] - m[0][2]*m[1][0]) / det;

        inv[2][0] =  (m[1][0]*m[2][1] - m[1][1]*m[2][0]) / det;
        inv[2][1] = -(m[0][0]*m[2][1] - m[0][1]*m[2][0]) / det;
        inv[2][2] =  (m[0][0]*m[1][1] - m[0][1]*m[1][0]) / det;

        return inv;
    }

    // Method to display a matrix
    public static void displayMatrix(double[][] matrix) {
        if (matrix == null) return;

        for (double[] row : matrix) {
            for (double val : row) {
                System.out.printf("%.2f\t", val);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {

        // 2x2 Matrix
        double[][] m2 = createMatrix(2, 2);
        System.out.println("2x2 Matrix:");
        displayMatrix(m2);

        System.out.println("Transpose:");
        displayMatrix(transpose(m2));

        System.out.println("Determinant (2x2): " + determinant2x2(m2));
        System.out.println("Inverse (2x2):");
        displayMatrix(inverse2x2(m2));

        // 3x3 Matrix
        double[][] m3 = createMatrix(3, 3);
        System.out.println("3x3 Matrix:");
        displayMatrix(m3);

        System.out.println("Transpose:");
        displayMatrix(transpose(m3));

        System.out.println("Determinant (3x3): " + determinant3x3(m3));
        System.out.println("Inverse (3x3):");
        displayMatrix(inverse3x3(m3));
    }
}
