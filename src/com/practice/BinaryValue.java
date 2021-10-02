package com.practice;

/*
* Find binary value with following expression.
*  -2 pow n * i
*
*  Example:
*  -8 = 0001
*
* */
public class BinaryValue {

    private int inputValue;
    private int[] binaryValues = {0,1};

    public static void main(String[] args) {

        BinaryValue binaryValue = new BinaryValue();
        binaryValue.inputValue = -6;

        binaryValue.binaryString("", 0);
    }

    private void binaryString(String binary, int sum) {

        for(int i=0; i<binaryValues.length;i++) {
            if(binary.length() > 16) {
                return;
            } else if(sum == inputValue) {
                System.out.println("Result :: "+binary);
                System.exit(0);
            } else {
                sum+= Math.pow(-2, binary.length())*binaryValues[i];
                binaryString(binary+binaryValues[i], sum);
            }
        }
    }
}
