public class ArrayBasics {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("Array elements:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }

        int sum = 0;
        int max = numbers[0];
        int min = numbers[0];

        for (int number : numbers) {
            sum += number;
            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            }
        }

        System.out.println();
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + (sum / (double) numbers.length));
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);

        int target = 30;
        boolean found = false;

        for (int number : numbers) {
            if (number == target) {
                found = true;
                break;
            }
        }

        System.out.println("Contains " + target + ": " + found);
    }
}