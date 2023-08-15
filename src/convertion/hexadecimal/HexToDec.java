package convertion.hexadecimal;

import java.util.*;

public class HexToDec
{
    /*
     * Hexadecimal to decimal
     * + Get hex input
     * + convert and return result
     */
    public void hexToDec()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nPlease enter the hexadecimal number (Type EXIT to quit): ");
        String hex = sc.nextLine();

        if (hex.equalsIgnoreCase("EXIT"))
            return;

        try
        {
            int decimal = Integer.parseInt(hex, 16);
            System.out.println(hex + " = " + decimal + " in decimal\n");
        }
        catch (Exception e)
        {
            System.out.println("There has been an error!\nError message: " + e + "\n");
        }
    }
}
