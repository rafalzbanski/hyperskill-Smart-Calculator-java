package stage2;

/**
 * The main method to start the ContinuousCalculator application.
 */
public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        InputHandler inputHandler = new InputHandler();
        ContinuousCalculator continuousCalculator = new ContinuousCalculator(calculator, inputHandler);
        continuousCalculator.run();
    }
}
