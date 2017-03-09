package com.company;

/**
 * Sort input array
 */
public class Sorter {

    /**
     * Sort array by "Bubble sorting"
     * @param inputValues
     * @param order "1" - Asc sorting, "2" - Desc sorting.
     * @return array Sorted array
     * @throws Exception
     */
    final public static int[] bubbleSorting(int[] inputValues, int order) throws Exception {
        if (order != 1 && order != 2){
            throw new Exception("Allowed only 1 or 2 values");
        }

        int temp = 0;
        int length = inputValues.length;

        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (order == 1 ? (inputValues[i] > inputValues[j]) : (inputValues[i] < inputValues[j])) {
                    temp = inputValues[i];
                    inputValues[i] = inputValues[j];
                    inputValues[j] = temp;
                }
            }
        }

        return inputValues;
    }
}
