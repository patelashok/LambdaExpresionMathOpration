package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;


public class NumberPlaylist2 {
    public static void main(String[] args) {

        //creation sample collection
        List<Integer> mylist2 = new ArrayList<Integer>();
        for (int i = 0; i < 5; i++) mylist2.add(i);

        //Method7: implicit Lambda function to check even
        Predicate<Integer> isEvenFunction= n->n > 0 && n%2 ==0;
        mylist2.forEach(n->{
            System.out.println("Meth7 for each value of: " +n+ "check for Even: " + isEvenFunction.test(n));
        });
    }
}