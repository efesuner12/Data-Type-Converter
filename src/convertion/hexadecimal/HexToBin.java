package convertion.hexadecimal;

import java.util.*;

public class HexToBin
{
    Scanner sc = new Scanner(System.in);

    /*
     * Hexadecimal to binary
     * + Get hex input (convert it to int)
     * + convert and return result
     */
    public String hexToBin()
    {
        System.out.print("\nPlease enter the hexadecimal number: ");
        String hex = sc.nextLine();

        int hexToConvert = Integer.parseInt(hex, 16);

        String binary = Integer.toBinaryString(hexToConvert);

        System.out.print(hex + " = " + binary + " in binary");

        return binary;
    }
}
