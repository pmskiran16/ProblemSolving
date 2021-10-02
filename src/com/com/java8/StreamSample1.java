package com.com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class StreamSample1 {
    public static void main(String args[]) {

        List<Integer> list = Arrays.asList(1,2,3,4,5,6);

        /*Consumer<Integer> consumer = new Consumer<Integer>() {
            @Override
            public void accept(Integer i) {
                System.out.println(i);
            }
        };*/

        /*Consumer<Integer> consumer = (Integer i) -> {
            System.out.println(i);
        };*/

        /*Consumer<Integer> consumer = i -> System.out.println(i);*/

//        list.forEach(consumer);

        list.forEach(i-> System.out.println(i));
    }
}
