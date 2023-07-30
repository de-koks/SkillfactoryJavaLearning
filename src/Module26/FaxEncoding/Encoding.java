package Module26.FaxEncoding;
/*
implementing RLE encoding and decoding algorithms of a fax connection.
 */
public class Encoding {

    private static String originallText = "aaaabbbbbccc";

    private static String encodedText = "4a5b3c";

    private static String result = encoding(originallText);
    private static String originallEncoded = "1b7w9b7w";
    private static String decodedText = "bwwwwwwwbbbbbbbbbwwwwwww";
    private static String result2 = decoding(originallEncoded);

    public static void main(String[] args) {
        if (result.equals(encodedText)) {
            System.out.println("It works! result equals " + result);
        } else {
            System.out.println("It doesn't work, result equals " + result);
        }

        if (result2.equals(decodedText)) {
            System.out.println("It works! result equals " + result2);
        } else {
            System.out.println("It doesn't work, result equals " + result2);
        }
    }

    public static String encoding(String input) {
        if (input == null || input.equals("")) return input;

        int counter = 1;
        StringBuilder output = new StringBuilder();
        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == input.charAt(i - 1)) {
                counter++;
                if (i == input.length() - 1) {
                    output.append(counter);
                    output.append(input.charAt(i - 1));
                }
            } else {
                output.append(counter);
                output.append(input.charAt(i - 1));
                counter = 1;
            }
        }
        return output.toString();
    }

    public static String decoding(String input) {
        if (input == null || input.equals("")) return input;

        StringBuilder output = new StringBuilder();

        for (int i = 1; i < input.length(); i += 2) {
            for (int j = 0; j < Character.getNumericValue(input.charAt(i-1)); j++) {
                output.append(input.charAt(i));
            }
        }
        return output.toString();
    }
}
