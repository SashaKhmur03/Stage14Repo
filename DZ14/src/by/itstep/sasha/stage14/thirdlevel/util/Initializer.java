package by.itstep.sasha.stage14.thirdlevel.util;

import by.itstep.sasha.stage14.thirdlevel.view.Printer;

import java.util.Scanner;

public class Initializer {
    public static final Scanner SCANNER;

    static {
        SCANNER = new Scanner(System.in);
    }

    public static void initializeVector(int[] vector) {

        for (int i = 0; i < vector.length; i++) {
            Printer.print("Input element " + (i + 1) + ": ");
            vector[i] = SCANNER.nextInt();
        }
    }
}
