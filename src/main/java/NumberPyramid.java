
//PROBLEM 06
//NUMBER PATTERN

public class NumberPyramid {
    public static void main(String[] args) {
        int max = 5;

        for (int i = max; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        for (int i = 2; i <= max; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

