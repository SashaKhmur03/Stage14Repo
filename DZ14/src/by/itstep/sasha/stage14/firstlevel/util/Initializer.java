package by.itstep.sasha.stage14.firstlevel.util;

import java.util.Scanner;

public class Initializer {
    public static final Scanner SCANNER;

    static {
        SCANNER = new Scanner(System.in);
    }

    public static void readVectorFromInput(int[] vector) {

        System.out.println("Enter vector values:");
        for (int i = 0; i < vector.length; i++) {
            vector[i] = SCANNER.nextInt();
        }
    }
}