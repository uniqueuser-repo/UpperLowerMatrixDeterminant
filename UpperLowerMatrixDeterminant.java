public class UpperLowerMatrixDeterminant {
    public static int calculate(int[][] input) {

        /* no error handling, assumes that the input is correct */
        int counter = input[0][0];

        for (int i = 1; i < input.length; i++) {
            counter *= input[i][i];
        }

        return counter;

    }
}
