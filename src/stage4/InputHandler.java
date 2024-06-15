package stage4;

import java.util.Scanner;

/**
 * The InputHandler class handles user input from the console.
 */
class InputHandler {
    private final Scanner scanner;

    /**
     * Initializes a new InputHandler with a Scanner.
     */
    public InputHandler() {
        scanner = new Scanner(System.in);
    }

    /**
     * Reads a line of input from the user, trims it, and returns it.
     *
     * @return the trimmed input line
     */
    public String getInput() {
        return scanner.nextLine().trim();
    }
}