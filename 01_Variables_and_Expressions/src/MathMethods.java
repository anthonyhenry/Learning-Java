public class MathMethods {
    public static void main(String[] args) {
        // The Math class includes about 30 math methods for use in Java
        // The Math class is part of Java's standard language package, so no import is required

        // Exponents
        double exponentExample = Math.pow(2.0, 8.0); // Note that .pow() returns a double
        System.out.println(exponentExample);

        // Square Root
        double squareRootExample = Math.sqrt(36.0);
        System.out.println(squareRootExample);

        // Absolute Value
        double absoluteValueExample = Math.abs(-9.0);
        System.out.println(absoluteValueExample);
    }
}
