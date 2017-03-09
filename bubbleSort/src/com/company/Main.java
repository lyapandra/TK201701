package com.company;

import java.util.Scanner;

/**
 * Main class
 */
public class Main {
    /**
     * It's used for making the caught exception by red color
     */
    public static final String ANSI_RED = "\u001B[31m";

    /**
     * Main method of the BubbleSort project
     *
     * @param args
     */
    public static void main(String[] args) {
        int order = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of elements: ");
        int m = s.nextInt();

        int inputValues[] = new int[m];

        System.out.println("Enter values: ");
        for (int i = 0; i < inputValues.length; i++) {
            inputValues[i] = s.nextInt();
        }

        System.out.println("Asc or Desc? 1 - ASC, 2 - DESC: ");
        order = s.nextInt();

        try {
            Sorter.bubbleSorting(inputValues, order);
        } catch (Exception e) {
            System.out.println(ANSI_RED + e.getMessage() + ANSI_RED);
            return;
        }

        for (int i : inputValues) {
            System.out.print(i + " ");
        }
    }
}
