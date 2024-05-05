package by.itstep.sasha.stage14.fourthlevel.util;

import by.itstep.sasha.stage14.fourthlevel.view.Printer;

import java.util.Scanner;

public class ReaderVector {
    private static final Scanner SCANNER;

    static {
        SCANNER = new Scanner(System.in);
    }
    public static void consoleInit(int[] vector){

        Printer.print("Enter the vector: ");

        for (int i = 0; i < vector.length; i++) {
            vector[i] = SCANNER.nextInt();
        }
    }
}
