package by.itstep.sasha.stage14.secondlevel.util;

import by.itstep.sasha.stage14.thirdlevel.view.Printer;

import java.util.Scanner;

public class Initializer {
    public static final Scanner SCANNER;

    static {
        SCANNER = new Scanner(System.in);
    }

    public static void readVectorFromInput(int[] vector) {

        Printer.print("Enter vector values:");
        for (int i = 0; i < vector.length; i++) {
            vector[i] = SCANNER.nextInt();
        }
    }
}

