package stage4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        InputHandler inputHandler = new InputHandler();
        ContinuousCalculator continuousCalculator = new ContinuousCalculator(calculator, inputHandler);
        continuousCalculator.run();
    }
}