package by.itstep.sasha.stage14.firstlevel.model;

public class VectorCounter {
    public static int countNonZeroElements(int[] vector) {
        int count = 0;
        for (int num : vector) {
            if (num != 0) {
                count++;
            }
        }
        return count;
    }

    public static int countEvenElements(int[] vector) {
        int count = 0;
        for (int num : vector) {
            if (num % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static int countPositiveElements(int[] vector) {
        int count = 0;
        for (int num : vector) {
            if (num > 0) {
                count++;
            }
        }
        return count;
    }

    public static int countZeros(int[] vector) {
        int count = 0;
        for (int num : vector) {
            if (num == 0) {
                count++;
            }
        }
        return count;
    }

    public static int countOddNumbers(int[] vector) {
        int count = 0;
        for (int num : vector) {
            if (num % 2 != 0) {
                count++;
            }
        }
        return count;
    }

    public static int countNegativeNumbers(int[] vector) {
        int count = 0;
        for (int num : vector) {
            if (num < 0) {
                count++;
            }
        }
        return count;
    }
}
