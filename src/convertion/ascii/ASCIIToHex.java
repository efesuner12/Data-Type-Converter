package convertion.ascii;

import java.util.*;

public class ASCIIToHex
{
    /*
    * ASCII to Hexadecimal
    * + get ASCII input
    * + convert to hexadecimal and return
    */
    public void asciiToHex()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nPlease enter the ascii code (Type EXIT to quit): ");
        String ascii = sc.nextLine();

        if (ascii.equalsIgnoreCase("EXIT"))
            return;

        try
        {
            StringBuilder hex = new StringBuilder();

            for (char ch : ascii.toCharArray())
                hex.append(Integer.toHexString((int) ch));

            String hexResult = hex.toString();

            System.out.println(ascii + " = " + hexResult + " in hexadecimal\n");
        }
        catch (Exception e)
        {
            System.out.println("There has been an error!\nError message: " + e + "\n");
        }
    }
}
