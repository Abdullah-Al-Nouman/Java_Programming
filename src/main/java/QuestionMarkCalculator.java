
//PROBLEM 15
//     In a question paper, there are total 15 questions.
//     Some question mark is  10 and some question mark is 5
//    How much question needed if I totaling 100 mark for 5 marks and 10 marks ?

public class QuestionMarkCalculator {
    public static void main(String[] args) {

        int totalMarks = 100;
        int totalQuestions = 15;
        int fiveMarkQuestions = 0;
        int tenMarkQuestions = 0;

        for (fiveMarkQuestions = 0; fiveMarkQuestions <= totalQuestions; fiveMarkQuestions++) {

            tenMarkQuestions = totalQuestions - fiveMarkQuestions;

            if ((5 * fiveMarkQuestions + 10 * tenMarkQuestions) == totalMarks) {
                break;
            }
        }

        System.out.println("5 marks question is " + fiveMarkQuestions);
        System.out.println("10 marks question is " + tenMarkQuestions);
    }
}
