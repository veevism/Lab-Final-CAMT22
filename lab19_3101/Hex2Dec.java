package lab19_3101;

import java.util.Scanner;

public class Hex2Dec {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter hex : ");
        String hex = input.nextLine();

        try {
            System.out.println("The decimal for hex number "
                    + hex + " is " + hex2decimal(hex));

        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }

    }

    public static void checkHex(String s) throws NumberFormatException {

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if ((ch < '0' || ch > '9')
                    && (ch < 'A' || ch > 'F')) {

                throw new NumberFormatException("String is not a Hexadecimal");
            }
        }

    }

    public static int hex2decimal(String s) {
        checkHex(s);

        String digits = "0123456789ABCDEF";

        s = s.toUpperCase();

        int valstore = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int d = digits.indexOf(c);
            valstore = 16 * valstore + d;
        }

        return valstore;
    }
}
