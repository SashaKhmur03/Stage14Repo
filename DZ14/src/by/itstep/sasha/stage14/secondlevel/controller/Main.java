package by.itstep.sasha.stage14.secondlevel.controller;

import by.itstep.sasha.stage14.secondlevel.model.VectorWorker;
import by.itstep.sasha.stage14.secondlevel.util.ArrayCreator;
import by.itstep.sasha.stage14.secondlevel.util.Initializer;
import by.itstep.sasha.stage14.secondlevel.view.Printer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Printer.print("Enter vector size:");
        int size = scanner.nextInt();
        Printer.print("Input number N:");
        int n = scanner.nextInt();
        int[] vector = ArrayCreator.create(size);

        Initializer.readVectorFromInput(vector);

        String msg = "Number of vector elements";
        int count = VectorWorker.countElementsGreaterThan(vector, n);
        Printer.print(msg + " greater than N: " + count);

        int countLessThanN = VectorWorker.countElementsLessThan(vector, n);
        System.out.println(msg + " less than N: " + countLessThanN);

        int countEqualToN = VectorWorker.countElementsEqualTo(vector, n);
        System.out.println(msg + " equal to the number N: " + countEqualToN);

        int countNotEqualToN = VectorWorker.countElementsNotEqualTo(vector, n);
        System.out.println(msg + " not equal to the number N: "
                + countNotEqualToN);

        int countDivisibleByN = VectorWorker.countElementsDivisibleBy
                (vector, n);
        System.out.println(msg + " that are multiples of N: "
                + countDivisibleByN);

        int countNotDivisibleByN = VectorWorker.countElementsNotDivisibleBy
                (vector, n);
        System.out.println(msg + " not divisible by N: "
                + countNotDivisibleByN);

        int countAbsoluteGreaterThanN = VectorWorker.
                countElementsAbsoluteGreaterThan(vector, n);
        System.out.println(msg + " with absolute value is greater than N: "
                + countAbsoluteGreaterThanN);

        int countAbsoluteLessThanN = VectorWorker.countElementsAbsoluteLessThan
                (vector, n);
        System.out.println(msg + " with absolute value is less than N:"
                + countAbsoluteLessThanN);

        int countAbsoluteEqualToN = VectorWorker
                .countElementsAbsoluteEqualTo(vector, n);
        System.out.println(msg + " with an absolute " +
                "value equal to the number N: " + countAbsoluteEqualToN);
    }
}
