
//PROBLEM 12

//   A core i 7 laptop price is 85000 tk and a gaming mouse price is 2500 tk.
//   If I buy the laptop and 1 piece mouse, what will be my total cost after
//   giving 15% discount? [Extract the digits from the paragraph and calculate the price]

public class DiscountCalculatorFromText {
    public static void main(String[] args) {

        String paragraph = "A core i 7 laptop price is 85000 tk and a gaming mouse price is 2500 tk. If I buy the laptop and 1 piece mouse, what will be my total cost after giving 15% discount?";

        int[] extractedDigits = new int[5];
        int index = 0;

        String currentNumber = "";
        for (int i = 0; i < paragraph.length(); i++) {
            char ch = paragraph.charAt(i);


            if (Character.isDigit(ch)) {
                currentNumber += ch;
            } else {

                if (!currentNumber.isEmpty()) {
                    extractedDigits[index] = Integer.parseInt(currentNumber);
                    index++;
                    currentNumber = "";
                }
            }
        }

        if (!currentNumber.isEmpty()) {
            extractedDigits[index] = Integer.parseInt(currentNumber);
        }

        System.out.print("Digits after extraction: [");
        for (int i = 0; i < extractedDigits.length; i++) {
            System.out.print(extractedDigits[i]);
            if (i < extractedDigits.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        int laptopPrice = extractedDigits[1];
        int mousePrice = extractedDigits[2];
        int quantity = extractedDigits[3];
        int discountPercent = extractedDigits[4];

        int totalPrice = laptopPrice + (mousePrice * quantity);
        double discount = totalPrice * (discountPercent / 100.0);
        double finalPrice = totalPrice - discount;

        System.out.println("Final price is: " + finalPrice + " tk");
    }
}
