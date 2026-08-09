public class Task8 {

    public static int sumsOfSums(int... numbers) {
        int cumulative = 0;

        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            int sum = 0;

            for (int j = 1; j <= number; j++) {
                sum += j;
            }

            cumulative += sum;

            System.out.println("Parameter " + number + ": sum = " + sum
                    + ", cumulative sum = " + cumulative);
        }

        return cumulative;
    }

    public static void main(String[] args) {
        int[] numbers = {4, 5, 10};

        int totalSum = sumsOfSums(numbers);

        System.out.println("Total sum: " + totalSum);
    }
}