package by.itstep.sasha.stage14.thirdlevel.model;

public class VectorFinder {
    public static double calculateArithmeticMean( int[] vector) {
        int sum = 0;
        for (int num : vector) {
            sum += num;
        }
        return (double) sum / vector.length;
    }

    public static double calculateGeometricMean(int[] vector) {
        int product = 1;
        for (int num : vector) {
            product *= num;
        }
        return Math.pow(product, 1.0 / vector.length);
    }

    public static int countElementsGreaterThanArithmeticMean( int[] vector) {
        double arithmeticMean = calculateArithmeticMean(vector);
        int count = 0;
        for (int num : vector) {
            if (num > arithmeticMean) {
                count++;
            }
        }
        return count;
    }

    public static int countElementsGreaterThanGeometricMean( int[] vector) {
        double geometricMean = calculateGeometricMean(vector);
        int count = 0;
        for (int num : vector) {
            if (num > geometricMean) {
                count++;
            }
        }
        return count;
    }

    public static int countElementsLessThanArithmeticMean( int[] vector) {
        double arithmeticMean = calculateArithmeticMean(vector);
        int count = 0;
        for (int num : vector) {
            if (num < arithmeticMean) {
                count++;
            }
        }
        return count;
    }

    public static int countElementsLessThanGeometricMean( int[] vector) {
        double geometricMean = calculateGeometricMean(vector);
        int count = 0;
        for (int num : vector) {
            if (num < geometricMean) {
                count++;
            }
        }
        return count;
    }

    public static int countElementsApproximatelyEqualToArithmeticMean(double deviation, int[] vector) {
        double arithmeticMean = calculateArithmeticMean(vector);
        int count = 0;
        for (int num : vector) {
            if (Math.abs(num - arithmeticMean) <= deviation) {
                count++;
            }
        }
        return count;
    }

    public static int countElementsApproximatelyEqualToGeometricMean(double deviation, int[] vector) {
        double geometricMean = calculateGeometricMean(vector);
        int count = 0;
        for (int num : vector) {
            if (Math.abs(num - geometricMean) <= deviation) {
                count++;
            }
        }
        return count;
    }
}
