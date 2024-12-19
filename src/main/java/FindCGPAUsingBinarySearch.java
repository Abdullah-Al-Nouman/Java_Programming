
//PROBLEM 03
//3. Take a CGPA as user input. Now from the given array find if your
//        input CGPA is present using binary search algorithm

import java.util.Scanner;

public class FindCGPAUsingBinarySearch {
    public static void main(String[] args) {

        double[] cgpa = {3.50, 3.52, 3.43, 3.63, 3.48, 3.32, 3.30, 3.60, 3.86, 3.75};

        for (int i = 0; i < cgpa.length - 1; i++) {
            for (int j = i + 1; j < cgpa.length; j++) {
                if (cgpa[i] > cgpa[j]) {

                    double temp = cgpa[i];
                    cgpa[i] = cgpa[j];
                    cgpa[j] = temp;
                }
            }
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter a CGPA to search: ");
        double targetCGPA = scanner.nextDouble();

        int left = 0;
        int right = cgpa.length - 1;
        boolean found = false;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (cgpa[mid] == targetCGPA) {
                found = true;
                break;
            } else if (cgpa[mid] < targetCGPA) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        if (found) {
            System.out.println("The CGPA " + targetCGPA + " is present in the array.");
        } else {
            System.out.println("The CGPA " + targetCGPA + " is not present in the array.");
        }

        scanner.close();
    }
}
