class test {
    public static void main(String[] args) {
        int matrix[][] = { { 1, 1, 1, 0 }, { 0, 5, 0, 1 }, { 2, 1, 3, 10 } };
        int matrixElementsSum = 0;

        for (int i = 0; i < matrix.length - 1; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i + 1][j] = 0;
                }
                matrixElementsSum += matrix[i][j];
            }
        }
        for (int k = 0; k < matrix[matrix.length - 1].length; k++) {
            matrixElementsSum += matrix[matrix.length - 1][k];
        }
        System.out.println(matrixElementsSum);
    }
}