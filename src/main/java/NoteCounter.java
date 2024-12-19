//PROBLEM 05
//5. Write a program that will break down the amount and
// count notes for any given amount

import java.util.Scanner;

public class NoteCounter {
    public static void main(String[] args) {

        int[] notes = {1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount: ");
        int amount = scanner.nextInt();

        for (int i = 0; i < notes.length; i++) {
            int note = notes[i];

            int count = amount / note;

            if (count > 0) {
                System.out.println(note + " " + count);

                amount = amount % note;
            }
        }
        scanner.close();
    }
}
