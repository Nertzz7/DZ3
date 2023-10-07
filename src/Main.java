class AverageCalculator {

    public static void main(String[] args) {

        double[] numbers = {8.0, 2.0, -4.0, 2.0, 3.0, 6.0, -7.0, 1.5, 2.5, -3.0, 4.0, -1.0, 0.5, -2.0, 1.0};


        boolean foundNegative = false;


        int positiveCount = 0;


        double positiveSum = 0.0;


        for (double number : numbers) {
            if (foundNegative && number > 0) {


                positiveCount++;
                positiveSum += number;
            } else if (number < 0) {

                foundNegative = true;
            }
        }


        if (positiveCount > 0) {

            double average = positiveSum / positiveCount;
            System.out.println("Среднее арифметическое положительных чисел после первого отрицательного: " + average);
        } else {
            System.out.println("После первого отрицательного числа нет положительных чисел.");
        }
    }
}


