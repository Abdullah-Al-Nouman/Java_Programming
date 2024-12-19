
//PROBLEM 10
//10. Generate random password which length is 8. Should follow this password strategy:
//Min 1 capital letter, min 1 small letter, min 1 digit and min 1 special character.

import java.util.Random;

public class SimplePasswordGenerator {
    public static void main(String[] args) {

        int passwordLength = 8;

        String password = generatePassword(passwordLength);

        System.out.println("Generated Password: " + password);
    }

    public static String generatePassword(int length) {

        String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String smallLetters = "abcdefghijklmnopqrstuvwxyz";
        String digits = "0123456789";
        String specialCharacters = "!@#$%^&*";

        Random random = new Random();

        StringBuilder password = new StringBuilder();

        password.append(capitalLetters.charAt(random.nextInt(capitalLetters.length())));
        password.append(smallLetters.charAt(random.nextInt(smallLetters.length())));
        password.append(digits.charAt(random.nextInt(digits.length())));
        password.append(specialCharacters.charAt(random.nextInt(specialCharacters.length())));


        String allCharacters = capitalLetters + smallLetters + digits + specialCharacters;


        while (password.length() < length) {
            password.append(allCharacters.charAt(random.nextInt(allCharacters.length())));
        }


        return password.toString();
    }
}
