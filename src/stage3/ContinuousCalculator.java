package stage3;

/**
 * The ContinuousCalculator class manages the main loop of the calculator,
 * processing user inputs and performing calculations.
 */
class ContinuousCalculator {
    private static final String EXIT_COMMAND = "/exit";
    private static final String HELP_COMMAND = "/help";
    private final Calculator calculator;
    private final InputHandler inputHandler;

    /**
     * Initializes a new ContinuousCalculator with a Calculator and an InputHandler.
     *
     * @param calculator the Calculator to use for arithmetic operations
     * @param inputHandler the InputHandler to use for reading user input
     */

    public ContinuousCalculator(Calculator calculator, InputHandler inputHandler) {
        this.calculator = calculator;
        this.inputHandler = inputHandler;
    }

    /**
     * Starts the main loop of the calculator, continuously reading user inputs,
     * performing calculations, and handling special commands.
     */
    public void run() {
        while (true) {
            String input = inputHandler.getInput();
            if (input.equalsIgnoreCase(EXIT_COMMAND)) {
                System.out.println("Bye!");
                break;
            } else if (input.equalsIgnoreCase(HELP_COMMAND)) {
                System.out.println("The program calculates the sum of numbers");
                continue;
            }

            if (input.isEmpty()) {
                continue;
            }

            String[] parts = input.split("\\s+");
            try {
                if (parts.length > 1) {
                    int[] numbers = new int[parts.length];
                    for (int i = 0; i < numbers.length; i++) {
                        numbers[i] = Integer.parseInt(parts[i]);
                    }
                    int result = calculator.add(numbers);
                    System.out.println(result);
                } else if (parts.length == 1) {
                    int num = Integer.parseInt(parts[0]);
                    System.out.println(num);
                } else {
                    System.out.println("Invalid input");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input");
            }
        }
    }
}
