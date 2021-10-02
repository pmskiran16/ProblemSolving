package com.practice;

public class NewYearChaos {
    public static void main(String args[]) {

        NewYearChaos.minimumBribes(new int[]{1,2,5,3,7,8,6,4});
    }



    static void minimumBribes(int[] q) {

    }




    /*static void minimumBribes(int[] q) {
        int swapCnt = 0;

        for(int i=0; i<q.length; i++) {
            if(q[i] > (i+1)) {
                int delta = ((i+1)-q[i]) < 0 ? -((i+1)-q[i]) : ((i+1)-q[i]);
                if(delta > 2) {
                    swapCnt = -1;
                    break;
                } else if(q[i] >= (i+1)){
                    swapCnt += delta;
                    if(delta == 2 && q[i+1] == (i+1)) {
                        swapCnt++;
                    }
                }
            }
        }

        if(swapCnt == -1) {
            System.out.print("Too chaotic");
        } else {
            System.out.print(swapCnt);
        }
    }*/
}
