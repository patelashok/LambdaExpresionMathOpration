package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;


public class NumberPlaylist2 {
    public static void main(String[] args) {

        //creation sample collection
        List<Integer> mylist2 = new ArrayList<Integer>();
        for (int i = 0; i < 5; i++) mylist2.add(i);

        //Method6: implicit Lambda function to print double
        Function<Integer, Double> toDoubleFunction = n -> n.doubleValue();
        mylist2.forEach(n -> {
            System.out.println("Meth6 for each lambda double Value::" + toDoubleFunction.apply(n));
        });
    }
}