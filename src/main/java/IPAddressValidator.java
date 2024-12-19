
//PROBLEM 14
//Check if an IP address is valid or invalid. Conditions:
//IP address must be in this pattern: [digit]:[digit]:[digit]:[digit]. First
//digit should not be 0 or not be single digit

 import java.util.Scanner;

public class IPAddressValidator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an IP address: ");
        String ipAddress = scanner.nextLine();

        boolean isValid = validateIPAddress(ipAddress);

        if (isValid) {
            System.out.println("The IP address is valid.");
        } else {
            System.out.println("The IP address is invalid.");
        }

        scanner.close();
    }

    public static boolean validateIPAddress(String ip) {

        String[] parts = ip.split("\\.");

        if (parts.length != 4) {
            return false;
        }

        if (parts[0].length() < 2 || parts[0].startsWith("0")) {
            return false;
        }

        for (int i = 1; i < parts.length; i++) {

            if (!isNumeric(parts[i])) {
                return false;
            }
        }

        return true;
    }

    public static boolean isNumeric(String str) {

        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }
}
