public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int result = calculator.add(5, 3);
        System.out.println("Addition: " + result); // Output: 8

        result = calculator.subtract(10, 4);
        System.out.println("Subtraction: " + result); // Output: 6

        result = calculator.multiply(7, 2);
        System.out.println("Multiplication: " + result); // Output: 14

        result = calculator.divide(20, 5);
        System.out.println("Division: " + result); // Output: 4

        result = calculator.square(6);
        System.out.println("Square: " + result); // Output: 36

        MagicCalculator magicCalculator = new MagicCalculator();
        double sqrtResult = magicCalculator.squareRoot(25);
        System.out.println("Square Root: " + sqrtResult); // Output: 5.0

        double sinResult = magicCalculator.sin(0);
        System.out.println("Sine: " + sinResult); // Output: 0.0

        double cosResult = magicCalculator.cos(Math.PI);
        System.out.println("Cosine: " + cosResult); // Output: -1.0

        double tanResult = magicCalculator.tan(0);
        System.out.println("Tangent: " + tanResult); // Output: 0.0

        int factorialResult = magicCalculator.factorial(5);
        System.out.println("Factorial: " + factorialResult); // Output: 120
    }
}
