package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Cutthesticks_E {
    public static void main(String[] args) {
//        cutTheSticks(Arrays.asList(5, 4, 4, 2, 2, 8));
        cutTheSticks(Arrays.asList(1,2,3,4,3,3,2,1));
//        cutTheSticks(Arrays.asList(8,8,14,10,3,5,14,12));
    }

    public static List<Integer> cutTheSticks(List<Integer> arr) {
        List<Integer> elementCntForIte = new ArrayList<>();
        Collections.sort(arr);

        int ignoreIndex = 0;
        for(int i=0; i<arr.size()-1; i++) {
            if(arr.get(i) == (int)arr.get(i+1)) {
                continue;
            }

            elementCntForIte.add(arr.size() - ignoreIndex);
            ignoreIndex = i+1;
        }

        elementCntForIte.add(arr.size() - ignoreIndex);
        return elementCntForIte;
    }
}
