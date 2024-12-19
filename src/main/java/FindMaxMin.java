//PROBLEM 04
//4. Generate random 10 integer numbers in an array and
//print out all the numbers from the array and also print the max
//and min number from the array.

import java.util.Random;
import java.util.Arrays;

public class FindMaxMin {
    public static void main(String[] args) {

        int[] numbers = new int[10];

        Random random = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100) + 1;
        }
        System.out.println("The random numbers are: " + Arrays.toString(numbers));

        int max = Arrays.stream(numbers).max().getAsInt();
        int min = Arrays.stream(numbers).min().getAsInt();

        System.out.println("The maximum number is: " + max);
        System.out.println("The minimum number is: " + min);
    }
}
