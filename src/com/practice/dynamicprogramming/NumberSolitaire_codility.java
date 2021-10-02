package com.practice.dynamicprogramming;

public class NumberSolitaire_codility {

    private static int maxValue = 0;
    private static int[] valueArr;
    private static int indexalues[] = new int[6];

    public static void main(String[] args) {
        valueArr = new int[]{1, -2, 0, 9, -1, -2, 1};

        indexalues[0] = valueArr[0];

        for(int i=1; i<valueArr.length; i++) {
            indexalues[i%6] = getMax() + valueArr[i];
        }

        System.out.println(indexalues[(valueArr.length-1) % 6]);

//        findMaxValue(new StringBuilder("0"), 0);
//        System.out.println(maxValue);
    }

    private static int getMax() {
        int max = indexalues[0];
        for(int i=1; i<indexalues.length; i++) {
            max = Math.max(max, indexalues[i]);
        }
        return max;
    }

    //My solution - time complexity failed. Have to use DP.
    private static void findMaxValue_1(StringBuilder strb, int sum) {
        if(sum == valueArr.length-1) {
            String values[] = strb.toString().split(", ");
            int tempLength = 0;
            for(int i=0, tempIndex = 0; i<values.length; i++) {
                tempIndex += Integer.parseInt(values[i]);
                tempLength += valueArr[tempIndex];
            }
//            System.out.println(strb.toString()+" -> "+sum+" ->"+tempLength);

            if(maxValue < tempLength || maxValue == 0)
                maxValue = tempLength;

            return;
        }

        for(int i = 1; i < valueArr.length-1; i++) {
            if((sum+i) <= valueArr.length-1)
                findMaxValue_1(new StringBuilder(strb).append(", "+i), (sum + i));
        }
    }
}
