public class ArithmeticExpressions {
    public static void main(String[] args) {
        /*
        *   Java precedence rules
        *       1. () Items within parentheses are evaluated first
        *       2. - (unary minus) is next
        *       3. * / %	Next to be evaluated are *, /, and %, having equal precedence.
        *       4. + -	Finally come + and - with equal precedence.
        *       5. left-to-right	If more than one operator of equal precedence could be evaluated, evaluation occurs left to right.
        */
        int example = -(22   +   1) * 10; //-230
        System.out.println(example);

        // When the operands of / are integers, the operator performs integer division, which does not generate any fraction
        System.out.println("Integer Division Example");
        System.out.println("10 / 4 = " + (10/4));

        // If at least one operand of / is a floating-point type, then floating-point division occurs
        System.out.println("Floating Type Division Example");
        System.out.println("10 / 4.0 = " + (10/4.0));
    }
}
