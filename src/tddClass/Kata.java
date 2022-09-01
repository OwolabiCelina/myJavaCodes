package tddClass;

public class Kata {
    public int bitFlipper(int digit) {
        if (digit == 1) {
            return 0;
        } else if (digit == 0) {
            return 1;
        }
        return digit;
    }


    public boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        }
        return false;
    }

    public int getQuantity(int quantity) {
        if (quantity >= 1 && quantity <= 4) {
            return quantity * 2000;
        }
        if (quantity >= 5 && quantity <= 9) {
            return quantity * 1800;
        }
        if (quantity >= 10 && quantity <= 29) {
            return quantity * 1600;
        }
        if (quantity >= 30 && quantity <= 49) {
            return quantity * 1500;
        }
        if (quantity >= 50 && quantity <= 99) {
            return quantity * 1300;
        }
        if (quantity >= 100 && quantity <= 199) {
            return quantity * 1200;
        }
        if (quantity >= 200 && quantity <= 499) {
            return quantity * 1100;
        }
        if (quantity >= 500) {
            return quantity * 1000;
        }
        return 0;
    }

    public int maximumElement(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public int minimumElement(int[] numbers) {
        int min = Integer.MAX_VALUE;
        for (int y = 0; y < numbers.length; y++) {
            if (numbers[y] < min) {
                min = numbers[y];
            }
        }
        return min;
    }

    public int findSumOfElement(int[] numbers) {
        int sum = 0;
        int i;
        for (i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }

    public double findSumOfAverage(int[] numbers) {
        int sum = 0;
        double average = 0.0;
        for (int y = 0; y < numbers.length; y++) {
            sum = sum + numbers[y];
            average = (double) sum / numbers.length;
        }
        return  average;
    }

//    public int findPrimeNumber(int[] array) {
//        int number = 0;
//        if (number % == 0){
//
//        }
//    }
}