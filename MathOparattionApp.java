package com.bridglelabz;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
@FunctionalInterface
interface IMathFunction {
    int calculate(int a, int b);

}
public class MathOparattionApp {

    public static void main(String[] args) {
        //using method Reference instead of lambda expression
        // this expression implement "IMathFunction" interface
        IMathFunction add = (int a, int b) -> a + b;
        IMathFunction subtract = (int a, int b) -> a - b;
        IMathFunction multiply = (int a, int b) -> a * b;
        IMathFunction divide = (int a, int b) -> a / b;
        System.out.println("Addition " + add.calculate(4,6));
        System.out.println("Subtaction " + subtract.calculate(6,4));
        System.out.println("Mulitiply " + multiply.calculate(4,6));
        System.out.println("Divide " + divide.calculate(6,2));


    }
}
