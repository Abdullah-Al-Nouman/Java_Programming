
//PROBLEM 08
//8. Count number of words, number of characters without spaces,
//number of vowels and consonant from the given string

public class CountElementOfChar {
    public static void main(String[] args) {

        String input = "I am a SQA Engineer";

        int wordCount = 0;
        int charCount = 0;
        int vowelCount = 0;
        int consonantCount = 0;

        String[] words = input.trim().split("\\s+");
        wordCount = words.length;

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (Character.isLetter(c)) {

                charCount++;


                if (isVowel(c)) {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }
        }

        System.out.println("Words: " + wordCount);
        System.out.println("Chars : " + charCount);
        System.out.println("Vowels: " + vowelCount);
        System.out.println("Consonants: " + consonantCount);
    }

    public static boolean isVowel(char c) {

        c = Character.toLowerCase(c);

        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
