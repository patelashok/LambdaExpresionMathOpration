package com.bridgelabz;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class NumberPlaylist {
    public static void main(String[] args) {
        //creation sample collection
        List<Integer> mylist =new ArrayList<Integer>();
        for (int i=0; i<5;i++) mylist.add(i);

        //Method 1: traversing using Iterator
        Iterator<Integer> it =mylist.iterator();
        while (it.hasNext()){
            Integer i = it.next();
            System.out.println("Mth1 iterator value " +i);
        }

        //Method 2: traversing with explicit interface implementation
        class MyConsumer implements Consumer<Integer> {
            public  void accept(Integer t){
                System.out.println("Meth2 Consumer imp Value " +t);
            }
        }
        MyConsumer action =new MyConsumer();
        mylist.forEach(action);

        //method 3: traversing with Anonymous consumer interface implementation
        mylist.forEach(new Consumer<Integer>()
        {
         @Override
            public void accept(Integer t){
                System.out.println("Meth3: foreach anonymous class value"+t);
            }
        });

        //method4: Explicit lambda function
        Consumer<Integer>myListAction=n->{
            System.out.println("Meth4 foreach lambda imp value " +n);
        };
        mylist.forEach(myListAction);

        //Method 5: Implicit lambda function
        mylist.forEach(n->{
            System.out.println("Meth5: foreach lambda imp1 value "+n);
        });



        //Method6: implicit Lambda function to print double
        Function<Integer,Double> toDoubleFunction=n->n.doubleValue();
        mylist.forEach(n->{
            System.out.println("Meth6 for each lambda double Value::"+toDoubleFunction.apply(n));
        });

        //Method7: implicit Lambda function to check even
        Predicate<Integer> isEvenFunction= n->n > 0 && n%2 ==0;
        mylist.forEach(n->{
            System.out.println("Meth7 for each value of: " +n+
                    "check for Even: " + isEvenFunction.test(n));
        });


    }
}

