public class Main {
    public static double hrMinToMin(int origHours, int origMinutes) {
        int totMinutes;      // Resulting minutes

        totMinutes = (origHours * 60) + origMinutes;

        return origMinutes;
    }

    // Method returns origNum cubed
    public static int cubeNum(int origNum) {
        return origNum * origNum * origNum;
    }

    public static void main(String[] args) {
        System.out.println("Testing started");

        // Assert is a compact way to print an error message when an expression evaluates to false
        // The complete error message includes the current line number and a detailed message denoted by detailedMessage
        // Assertions are not enabled by default. The command-line option -ea is necessary at run-time. Ex: java -ea HrMinToMinTestHarness
        assert (hrMinToMin(0, 0) == 0) : "Assertion (hrMinToMin(0, 0) == 0) failed";
        assert (hrMinToMin(0, 1) == 1) : "Assertion (hrMinToMin(0, 1) == 1) failed";
        assert (hrMinToMin(0, 99) == 99) : "Assertion (hrMinToMin(0, 99) == 99) failed";
        assert (hrMinToMin(1, 0) == 60) : "Assertion (hrMinToMin(1, 0) == 60) failed";
        assert (hrMinToMin(5, 0) == 300) : "Assertion (hrMinToMin(5, 0) == 300) failed";
        assert (hrMinToMin(2, 30) == 150) : "Assertion (hrMinToMin(2, 30) == 150) failed";
        // None of the above will run without the -ea command-line option

        // These print statements illustrate what a unit test might look like
        System.out.println("Testing started");
        System.out.println("2, expecting 8, got: " + cubeNum(2));

        /* Your solution goes here  */
        System.out.println("3, expecting 27, got: " + cubeNum(3));
        System.out.println("-1, expecting -1, got: " + cubeNum(-1));

        System.out.println("Testing completed");

    }

}
