package by.itstep.sasha.stage14.fourthlevel.model;

public class VectorManager {
        public static double calculateProductBetweenMinMax(int[] vector) {
            int minIndex = 0;
            int maxIndex = 0;
            double minValue = vector[0];
            double maxValue = vector[0];

            for (int i = 1; i < vector.length; i++) {
                if (vector[i] < minValue) {
                    minValue = vector[i];
                    minIndex = i;
                }
                if (vector[i] > maxValue) {
                    maxValue = vector[i];
                    maxIndex = i;
                }
            }

            double product = 1;
            if (minIndex < maxIndex) {
                for (int i = minIndex + 1; i < maxIndex; i++) {
                    product *= vector[i];
                }
            } else {
                for (int i = maxIndex + 1; i < minIndex; i++) {
                    product *= vector[i];
                }
            }

            return product;
        }
        public static int calculateSumBetweenZeros(int[] vector) {
            int firstZeroIndex = -1;
            int lastZeroIndex = -1;

            for (int i = 0; i < vector.length; i++) {
                if (vector[i] == 0) {
                    if (firstZeroIndex == -1) {
                        firstZeroIndex = i;
                    }
                    lastZeroIndex = i;
                }
            }

            int sum = 0;
            if (firstZeroIndex != -1 && firstZeroIndex != lastZeroIndex) {
                for (int i = firstZeroIndex + 1; i < lastZeroIndex; i++) {
                    sum += vector[i];
                }
            }

            return sum;
        }
        public static double calculateSumBeforeLastPositive(int[] vector) {
            double sum = 0;
            int lastIndex = -1;

            for (int i = 0; i < vector.length; i++) {
                if (vector[i] > 0) {
                    lastIndex = i;
                }
            }

            if (lastIndex != -1) {
                for (int i = 0; i < lastIndex; i++) {
                    sum += vector[i];
                }
            }

            return sum;
        }
        public static int calculateProductBetweenFirstTwoZeros(int[] vector) {
            int firstZeroIndex = -1;
            int secondZeroIndex = -1;

            for (int i = 0; i < vector.length; i++) {
                if (vector[i] == 0) {
                    if (firstZeroIndex == -1) {
                        firstZeroIndex = i;
                    } else {
                        secondZeroIndex = i;
                        break;
                    }
                }
            }

            int product = 1;
            if (firstZeroIndex != -1 && secondZeroIndex != -1 && firstZeroIndex != secondZeroIndex) {
                for (int i = firstZeroIndex + 1; i < secondZeroIndex; i++) {
                    product *= vector[i];
                }
            }

            return product;
        }
}