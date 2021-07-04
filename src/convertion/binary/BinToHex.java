package convertion.binary;

import java.util.*;

public class BinToHex
{
    Scanner sc = new Scanner(System.in);

    /*
     * Binary to hexadecimal
     * + Get binary input (convert it to int)
     * + convert and return result
     */
    public String binToHex()
    {
        System.out.print("\nPlease enter the binary number: ");
        String binary = sc.nextLine();

        int binToConvert = Integer.parseInt(binary, 2);

        String hexa = Integer.toHexString(binToConvert);

        System.out.println(binary + " = " + hexa + " in hexadecimal");

        return hexa;
    }
}
