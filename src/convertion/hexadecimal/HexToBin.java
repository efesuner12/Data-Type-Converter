package convertion.hexadecimal;

import java.util.*;

public class HexToBin
{
    /*
     * Hexadecimal to binary
     * + Get hex input (convert it to int)
     * + convert and return result
     */
    public void hexToBin()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nPlease enter the hexadecimal number (Type EXIT to quit): ");
        String hex = sc.nextLine();

        if (hex.equalsIgnoreCase("EXIT"))
            return;

        try
        {
            int hexToConvert = Integer.parseInt(hex, 16);
            String binary = Integer.toBinaryString(hexToConvert);

            System.out.println(hex + " = " + binary + " in binary\n");
        }
        catch (Exception e)
        {
            System.out.println("There has been an error!\nError message: " + e + "\n");
        }
    }
}
