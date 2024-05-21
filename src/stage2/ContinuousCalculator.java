package stage2;

class ContinuousCalculator {
    private static final String EXIT_COMMAND = "/exit";
    private final Calculator calculator;
    private final InputHandler inputHandler;

    public ContinuousCalculator(Calculator calculator, InputHandler inputHandler) {
        this.calculator = calculator;
        this.inputHandler = inputHandler;
    }

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
