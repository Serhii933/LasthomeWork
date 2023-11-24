public class ArrayOperationsTest {

    public void runTests() {
        ArrayOperations arrayOperations = new ArrayOperations();
        testCalculateAverage(arrayOperations);
        testIsSquareMatrix(arrayOperations);
    }

    private void testCalculateAverage(ArrayOperations arrayOperations) {
        int[] array = {1, 2, 3, 4, 5};
        double average = arrayOperations.calculateAverage(array);
        System.out.println("Середнє арифметичне масиву: " + average);
    }

    private void testIsSquareMatrix(ArrayOperations arrayOperations) {
        int[][] squareMatrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] nonSquareMatrix = {
                {1, 2, 3},
                {4, 5, 6}
        };

        System.out.println("Чи є матриця квадратною: " + arrayOperations.isSquareMatrix(squareMatrix));
        System.out.println("Чи є матриця квадратною: " + arrayOperations.isSquareMatrix(nonSquareMatrix));
    }

    public static void main(String[] args) {
        ArrayOperationsTest test = new ArrayOperationsTest();
        test.runTests();
    }
}