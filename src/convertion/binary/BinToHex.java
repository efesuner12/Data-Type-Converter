package convertion.binary;

import java.util.*;

public class BinToHex
{
    /*
     * Binary to hexadecimal
     * + Get binary input (convert it to int)
     * + convert and return result
     */
    public void binToHex()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nPlease enter the binary number (Type EXIT to quit): ");
        String binary = sc.nextLine();

        if (binary.equalsIgnoreCase("EXIT"))
            return;

        try
        {
            int binToConvert = Integer.parseInt(binary, 2);
            String hexa = Integer.toHexString(binToConvert);

            System.out.println(binary + " = " + hexa + " in hexadecimal\n");
        }
        catch (Exception e)
        {
            System.out.println("There has been an error!\nError message: " + e + "\n");
        }
    }
}
