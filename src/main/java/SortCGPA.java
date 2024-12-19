
//Problem Number 02
//2. Sort the above scores from according to the order of highest CGPA
public class SortCGPA {
    public static void main(String[] args) {

        double[] cgpa = {3.50, 3.52, 3.43, 3.63, 3.48, 3.32, 3.30, 3.60, 3.86, 3.75};


        for (int i = 0; i < cgpa.length - 1; i++) {
            for (int j = i + 1; j < cgpa.length; j++) {
                if (cgpa[i] < cgpa[j]) {

                    double temp = cgpa[i];
                    cgpa[i] = cgpa[j];
                    cgpa[j] = temp;
                }
            }
        }


        System.out.println("CGPA scores in descending order:");
        for (double score : cgpa) {
            System.out.print(score + " ");
        }
    }
}
