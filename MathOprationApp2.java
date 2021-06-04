package com.bridglelabz;

@FunctionalInterface
interface IMathFunction2 {
    int calculate(int a, int b);
    static void printResult(int a,int b, String function,IMathFunction fobj){
        System.out.println("Result of " +function+ "is " +fobj.calculate(a, b));
    }

}
public  class MathOprationApp2 {

    public static void main(String[] args) {
        IMathFunction add = (int a, int b) -> a + b;
        IMathFunction subtract = (int a, int b) -> a - b;
        IMathFunction multiply = (int a, int b) -> a * b;
        IMathFunction divide = (int a, int b) -> a / b;
        // passing Lambda Expression as function parameter to print result
        IMathFunction2.printResult(6,4,"Additon",add);
        IMathFunction2.printResult(6,4,"Additon",subtract);
        IMathFunction2.printResult(6,4,"Additon",multiply);
        IMathFunction2.printResult(6,4,"Additon",divide);
    }
}
