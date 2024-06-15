package stage4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class ContinuousCalculator {
    // Define constants for special commands
    private static final String EXIT_COMMAND = "/exit";
    private static final String HELP_COMMAND = "/help";

    private final Calculator calculator;
    private final InputHandler inputHandler;

    // Constructor
    public ContinuousCalculator(Calculator calculator, InputHandler inputHandler) {
        this.calculator = calculator;
        this.inputHandler = inputHandler;
    }

    // Main method to run the calculator
    public void run() {
        // Main loop to continuously process user input
        while (true) {
            String input = inputHandler.getInput();

            // Check for special commands
            if (input.equalsIgnoreCase(EXIT_COMMAND)) {
                System.out.println("Bye!");
                break;
            } else if (input.equalsIgnoreCase(HELP_COMMAND)) {
                printHelp();
                continue;
            }

            // Process arithmetic expressions
            if (!input.isEmpty()) {
                int result = calculateExpression(input);
                System.out.println(result);
            }
        }
    }

    private int calculateExpression(String input) {
        // Normalize input by removing extra spaces and handling consecutive minus and plus signs
        input = input.replaceAll("\\s+", " ");
        input = handleConsecutiveMinusSigns(input);
        input = handleConsecutivePlusSigns(input);

        // Split input into tokens
        String[] tokens = input.split("\\s+");

        int result = 0;
        boolean isAddition = true; // Start with addition

        // Iterate through tokens and perform calculations
        for (String token : tokens) {
            if (token.equals("+")) {
                isAddition = true;
            } else if (token.equals("-")) {
                isAddition = false;
            } else {
                int number = Integer.parseInt(token);
                result = isAddition ? result + number : result - number;
            }
        }

        return result;
    }

    // Method to handle consecutive minus signs and convert them to plus
    private String handleConsecutiveMinusSigns(String input) {
        // Use regular expression to find consecutive minus signs
        Pattern pattern = Pattern.compile("-{2,}");
        Matcher matcher = pattern.matcher(input);

        // Replace consecutive minus signs with appropriate number of plus signs
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            int count = end - start;
            input = input.substring(0, start) + (count % 2 == 0 ? "+" : "-") + input.substring(end);
            matcher = pattern.matcher(input);
        }

        return input;
    }

    // Method to handle consecutive plus signs and convert them to single plus
    private String handleConsecutivePlusSigns(String input) {
        // Use regular expression to find consecutive plus signs
        Pattern pattern = Pattern.compile("\\+{2,}");
        Matcher matcher = pattern.matcher(input);

        // Replace consecutive plus signs with single plus sign
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            input = input.substring(0, start) + "+" + input.substring(end);
            matcher = pattern.matcher(input);
        }

        return input;
    }


    // Method to print help information
    private void printHelp() {
        System.out.println("Smart Calculator supports addition (+) and subtraction (-) operations.");
    }
}