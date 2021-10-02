package com.practice;

import java.util.Arrays;
import java.util.List;

public class PrideParadeOrganization_C {
    public static void main(String[] args) {
        changeTasks(Arrays.asList(2, 5, 4, 4)).forEach(System.out::println);
    }

    public static List<Integer> changeTasks(List<Integer> tasks) {
        // Write your code here

        Integer cnt = tasks.size(),min=-1 ,secondMin=-1, diff = 0;
        for(int i = 0; i<cnt; i++) {
            if(min > tasks.get(i) || min == -1) {
                min = tasks.get(i);
            } else if(secondMin > tasks.get(i) || secondMin == -1) {
                secondMin = tasks.get(i);
            }
        }

        if(secondMin - min == 1)
            diff = min -1;
        else
            diff = min;

        for(int i=0; i<cnt; i++) {
            if(tasks.get(i).equals(min)) {
                tasks.set(i, 1);
            } else {
                tasks.set(i, tasks.get(i) - diff);
            }
        }

        return tasks;
    }
}
