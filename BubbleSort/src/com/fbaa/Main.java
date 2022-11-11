package com.fbaa;

public class Main {

    public static void main(String[] args) {
        int [] intArray = {20, 35, -15, 7, 55, 1, -22};

        for (int lastIdx = intArray.length - 1; lastIdx > 0; lastIdx--){
            for (int i = 0; i < lastIdx; i++) {
                if (intArray[i] > intArray[i + 1]){
                    swap(intArray, i, i + 1);
                }
            }
        }

        for(int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }

    public static void swap(int[] array, int i, int j){
        if (i == j) {
            return;
        }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;

    }
}
