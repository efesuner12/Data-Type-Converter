package convertion.decimal;

import java.util.*;

public class DecToHex
{
    Scanner sc = new Scanner(System.in);

    /*
     * Decimal to hexadecimal
     * + Get decimal input
     * + convert and return result
     */
    public String decToHex()
    {
        System.out.print("\nPlease enter the decimal number: ");
        int decimal = sc.nextInt();

        String hexa = Integer.toHexString(decimal);

        System.out.print(decimal + " = " + hexa + " in hexadecimal");

        return hexa;
    }
}
