
//Problem 11
//Remove Vowels from a String

public class RemoveVowels {
    public static void main(String[] args) {

        String input = "I am a SQA Engineer";

        String result = input.replaceAll("[AEIOUaeiou]", "");

        System.out.println("Input: " + input);
        System.out.println("Output: " + result);
    }
}
