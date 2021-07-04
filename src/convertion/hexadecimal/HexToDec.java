package convertion.hexadecimal;

import java.util.*;

public class HexToDec
{
    Scanner sc = new Scanner(System.in);

    /*
     * Hexadecimal to decimal
     * + Get hex input
     * + convert and return result
     */
    public int hexToDec()
    {
        System.out.print("\nPlease enter the hexadecimal number: ");
        String hex = sc.nextLine();

        int decimal = Integer.parseInt(hex, 16);

        System.out.print(hex + " = " + decimal + " in decimal");

        return decimal;
    }
}
