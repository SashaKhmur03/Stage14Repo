package by.itstep.sasha.stage14.thirdlevel.controller;


import by.itstep.sasha.stage14.thirdlevel.model.VectorFinder;
import by.itstep.sasha.stage14.thirdlevel.util.ArrayCreator;
import by.itstep.sasha.stage14.thirdlevel.util.Initializer;
import by.itstep.sasha.stage14.thirdlevel.view.Printer;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Printer.print("Enter vector size:");
        int size = scanner.nextInt();
        Printer.print("Input number N:");
        int deviation = scanner.nextInt();
        int[] vector = ArrayCreator.create(size);

        Initializer.initializeVector(vector);
        String msg = "Number of vector elements";

        int countGreaterThanArithmeticMean = VectorFinder.
                countElementsGreaterThanArithmeticMean(vector);
        Printer.print(msg + " greater than the arithmetic mean: "
                + countGreaterThanArithmeticMean);

        int countGreaterThanGeometricMean = VectorFinder.
                countElementsGreaterThanGeometricMean(vector);
        Printer.print(msg + " greater than the geometric mean value: "
                + countGreaterThanGeometricMean);

        int countLessThanArithmeticMean = VectorFinder.
                countElementsLessThanArithmeticMean(vector);
        Printer.print(msg + " less than the arithmetic mean: "
                + countLessThanArithmeticMean);

        int countLessThanGeometricMean = VectorFinder.
                countElementsLessThanGeometricMean(vector);
        Printer.print(msg + " less than the geometric mean value: "
                + countLessThanGeometricMean);

        int countApproximatelyEqualToArithmeticMean = VectorFinder.
                countElementsApproximatelyEqualToArithmeticMean
                        (deviation, vector);
        Printer.print(msg + " approximately equal to the arithmetic" +
                " mean with an error of +/- D: "
                + countApproximatelyEqualToArithmeticMean);

        int countApproximatelyEqualToGeometricMean = VectorFinder.
                countElementsApproximatelyEqualToGeometricMean
                        (deviation, vector);
        Printer.print(msg + " approximately equal to the geometric mean value" +
                " with an error of +/- D: "
                + countApproximatelyEqualToGeometricMean);
    }
}
