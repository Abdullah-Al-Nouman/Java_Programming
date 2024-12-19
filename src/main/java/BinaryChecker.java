
//PROBLEM 09
//Write a program that evaluates a string entered by the user
//to determine whether it is binary or not.

import java.util.Scanner;

public class BinaryChecker {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        boolean isBinary = true;

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c != '0' && c != '1') {
                isBinary = false;
                break;
            }
        }

        System.out.println(isBinary);
        scanner.close();
    }
}
