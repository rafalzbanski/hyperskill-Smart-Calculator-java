package stage2;

/**
 * The ContinuousCalculator class manages the main loop of the calculator,
 * processing user inputs and performing calculations.
 */
class ContinuousCalculator {
    private static final String EXIT_COMMAND = "/exit";
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
            }

            if (input.isEmpty()) {
                continue;
            }

            String[] parts = input.split("\\s+");
            try {
                if (parts.length == 2) {
                    int num1 = Integer.parseInt(parts[0]);
                    int num2 = Integer.parseInt(parts[1]);
                    int result = calculator.add(num1, num2);
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
