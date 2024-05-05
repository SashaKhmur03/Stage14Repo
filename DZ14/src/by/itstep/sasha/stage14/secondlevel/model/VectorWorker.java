package by.itstep.sasha.stage14.secondlevel.model;

public class VectorWorker {
    public static int countElementsGreaterThan(int[] vector, int n) {
        int count = 0;
        for (int num : vector) {
            if (num > n) {
                count++;
            }
        }
        return count;
    }

    public static int countElementsLessThan(int[] vector, int n) {
        int count = 0;
        for (int num : vector) {
            if (num < n) {
                count++;
            }
        }
        return count;
    }

    public static int countElementsEqualTo(int[] vector, int n) {
        int count = 0;
        for (int num : vector) {
            if (num == n) {
                count++;
            }
        }
        return count;
    }

    public static int countElementsNotEqualTo(int[] vector, int n) {
        int count = 0;
        for (int num : vector) {
            if (num != n) {
                count++;
            }
        }
        return count;
    }

    public static int countElementsDivisibleBy(int[] vector, int n) {
        int count = 0;
        for (int num : vector) {
            if (num % n == 0) {
                count++;
            }
        }
        return count;
    }

    public static int countElementsNotDivisibleBy(int[] vector, int n) {
        int count = 0;
        for (int num : vector) {
            if (num % n != 0) {
                count++;
            }
        }
        return count;
    }

    public static int countElementsAbsoluteGreaterThan(int[] vector, int n) {
        int count = 0;
        for (int num : vector) {
            if (Math.abs(num) > n) {
                count++;
            }
        }
        return count;
    }

    public static int countElementsAbsoluteLessThan(int[] vector, int n) {
        int count = 0;
        for (int num : vector) {
            if (Math.abs(num) < n) {
                count++;
            }
        }
        return count;
    }

    public static int countElementsAbsoluteEqualTo(int[] vector, int n) {
        int count = 0;
        for (int num : vector) {
            if (Math.abs(num) == n) {
                count++;
            }
        }
        return count;
    }

}
