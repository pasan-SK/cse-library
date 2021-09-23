package it.uom.cse;

import java.util.Arrays;


public class MathOperation {

    public static double add(double... operands)
    {
        return Arrays.stream(operands).reduce(0d, Double::sum);
    }

    public static double subtract(double operand1, double operand2)
    {
        return operand1 - operand2;
    }
    public static int sumOfPrimes(int n) {
        int sum = 0;
        int j = 0;
        int i = 1;

        while (j < n) {
            boolean p = true;
            i ++;
            for (int k = 2; k < (int) Math.sqrt(i) + 1; k++) {
                if (i % k == 0) {
                    p = false;
                    break;
                }
            }
            if (p) {
                sum += i;
                j += 1;
            }
        }
        return sum;

    }
}
