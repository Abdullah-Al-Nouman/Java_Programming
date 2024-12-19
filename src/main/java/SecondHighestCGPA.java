//PROBLEM 01
//1. Here is the 10 students CGPA [3.50, 3.52, 3.43, 3.63, 3.48, 3.32, 3.30, 3.60, 3.86, 3.75]
//Find out who achieved the 2nd highest score.

public class SecondHighestCGPA {
    public static void main(String[] args) {

        double[] cgpa = {3.50, 3.52, 3.43, 3.63, 3.48, 3.32, 3.30, 3.60, 3.86, 3.75};


        double highest = Double.MIN_VALUE;
        double secondHighest = Double.MIN_VALUE;


        for (int i = 0; i < cgpa.length; i++) {
            if (cgpa[i] > highest) {
                secondHighest = highest;
                highest = cgpa[i];
            } else if (cgpa[i] > secondHighest && cgpa[i] != highest) {
                secondHighest = cgpa[i];
            }
        }

        if (secondHighest != Double.MIN_VALUE) {
            System.out.println("The second highest CGPA is: " + secondHighest);
        } else {
            System.out.println("There is no second highest CGPA.");
        }
    }
}
