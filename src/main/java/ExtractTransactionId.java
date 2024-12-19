
//PROBLEM 13
// 13. Extract Transaction Id from the given html

public class ExtractTransactionId {
    public static void main(String[] args) {

        String htmlContent = "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                "    <title>Transactions</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "    <div>\n" +
                "        <div class=\"button\">\n" +
                "            <p>Transaction Id: TXN1234</p>\n" +
                "        </div>\n" +
                "    </div>\n" +
                "</body>\n" +
                "</html>";


        String searchText = "Transaction Id:";
        int startIndex = htmlContent.indexOf(searchText);

        if (startIndex != -1) {

            int endIndex = htmlContent.indexOf("</p>", startIndex);

            String transactionId = htmlContent.substring(startIndex, endIndex);

            System.out.println(transactionId);
        } else {
            System.out.println("Transaction Id not found.");
        }
    }
}
