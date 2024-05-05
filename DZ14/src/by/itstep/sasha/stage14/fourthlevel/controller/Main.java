package by.itstep.sasha.stage14.fourthlevel.controller;

import by.itstep.sasha.stage14.fourthlevel.model.VectorManager;
import by.itstep.sasha.stage14.fourthlevel.util.ArrayCreator;
import by.itstep.sasha.stage14.fourthlevel.util.ReaderVector;
import by.itstep.sasha.stage14.fourthlevel.view.Printer;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Printer.print("Enter the size of the vector: ");
        int size = scanner.nextInt();

        int[] vector = ArrayCreator.create(size);

        ReaderVector.consoleInit(vector);


        double product = VectorManager.calculateProductBetweenMinMax(vector);
        Printer.print("Product between min and max elements: " + product);

        int sum = VectorManager.calculateSumBetweenZeros(vector);
        Printer.print("Sum between first and last zeros: " + sum);

        double sum1 = VectorManager.calculateSumBeforeLastPositive(vector);
        Printer.print("Sum before last positive element: " + sum1);

        int product1 = VectorManager.calculateProductBetweenFirstTwoZeros(vector);
        Printer.print("Product between first and second zeros: " + product1);
    }
}

