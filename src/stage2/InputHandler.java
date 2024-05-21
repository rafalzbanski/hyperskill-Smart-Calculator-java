package stage2;

import java.util.Scanner;

class InputHandler {
    private final Scanner scanner;

    public InputHandler() {
        scanner = new Scanner(System.in);
    }

    public String getInput() {
        return scanner.nextLine().trim();
    }
}
