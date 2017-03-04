package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введіть кількість чисел(наприклад 1000):");
        int input = in.nextInt();
        for (int i = 1; i <=input; i++) {
            if ((i % 3) == 0 || (i % 9) == 0)
                System.out.print(i + " ");
        }
    }
}
