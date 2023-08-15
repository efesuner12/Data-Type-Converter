package convertion.decimal;

import java.util.*;

public class DecToHex
{
    /*
     * Decimal to hexadecimal
     * + Get decimal input
     * + convert and return result
     */
    public void decToHex()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nPlease enter the decimal number (Type EXIT to quit): ");
        String input = sc.next();

        if (input.equalsIgnoreCase("EXIT"))
            return;

        try
        {
            int decimal = Integer.parseInt(input);
            String hexa = Integer.toHexString(decimal);

            System.out.println(decimal + " = " + hexa + " in hexadecimal\n");
        }
        catch (Exception e)
        {
            System.out.println("There has been an error!\nError message: " + e + "\n");
        }
    }
}
