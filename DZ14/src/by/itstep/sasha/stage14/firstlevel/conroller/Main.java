package by.itstep.sasha.stage14.firstlevel.conroller;

import by.itstep.sasha.stage14.firstlevel.util.ArrayCreator;
import by.itstep.sasha.stage14.firstlevel.util.Initializer;
import by.itstep.sasha.stage14.firstlevel.model.VectorCounter;
import by.itstep.sasha.stage14.firstlevel.view.ConsolePrinter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter vector size:");
        int size = scanner.nextInt();

        int[] vector = ArrayCreator.create(size);

        Initializer.readVectorFromInput(vector);

        String msg = "Number of";
        int nonZeroCount = VectorCounter.countNonZeroElements(vector);
        ConsolePrinter.print(msg +" non-zero vector elements: " + nonZeroCount);

        int evenCount = VectorCounter.countEvenElements(vector);
        ConsolePrinter.print(msg +" even vector elements: " + evenCount);

        int positiveCount = VectorCounter.countPositiveElements(vector);
        ConsolePrinter.print(msg +" positive elements of the vector: " + positiveCount);

        int zeroCount = VectorCounter.countZeros(vector);
        ConsolePrinter.print(msg +" zero elements of the vector: " + zeroCount);

        int oddCount = VectorCounter.countOddNumbers(vector);
        ConsolePrinter.print(msg +" odd vector elements: " + oddCount);

        int negativeCount = VectorCounter.countNegativeNumbers(vector);
        ConsolePrinter.print(msg +" negative vector elements:" + negativeCount);
    }
}
