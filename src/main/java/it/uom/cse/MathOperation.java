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

    public static long fib(long n){
        if(n==0)    return 0;
        if(n==1)    return 1;
        return MathOperation.fib(n-1)+MathOperation.fib(n-2);
    }
}
