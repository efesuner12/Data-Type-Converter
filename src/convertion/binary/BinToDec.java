package convertion.binary;

import java.util.*;

public class BinToDec
{
    Scanner sc = new Scanner(System.in);

    /*
     * Binary to decimal
     * + Get binary input
     * + convert and return result
     */
    public int binToDec()
    {
        System.out.print("\nPlease enter the binary number: ");
        String binary = sc.nextLine();

        int decimal = Integer.parseInt(binary, 2);

        System.out.print(binary + " = " + decimal + " in decimal");

        return decimal;
    }
}
