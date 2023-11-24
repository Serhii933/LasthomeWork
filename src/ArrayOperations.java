public class ArrayOperations {

    public double calculateAverage(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Масив не повинен бути порожнім або null");
        }

        int sum = 0;
        for (int element : array) {
            sum += element;
        }

        return (double) sum / array.length;
    }


    public boolean isSquareMatrix(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return false;
        }

        int rows = matrix.length;
        for (int i = 0; i < rows; i++) {
            if (matrix[i] == null || matrix[i].length != rows) {
                return false;
            }
        }

        return true;
    }
}
