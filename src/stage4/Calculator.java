package stage4;

/**
 * The Calculator class provides arithmetic operations.
 */
class Calculator {

    /**
     * Sums an array of integers and return the result
     *
     * @param numbers the array of integers to sum
     * @return the sum of integers in array
     */
    public int add(int[] numbers) {

        int sum = 0;

        for (int number: numbers) {
            sum += number;
        }

        return sum;
    }
}