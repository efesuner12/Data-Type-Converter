package convertion.ascii;

import java.util.*;

public class ASCIIToHex
{
    Scanner sc = new Scanner(System.in);

    /*
    * ASCII to Hexadecimal
    * + get ASCII input
    * + convert to hexadecimal and return
    */
    public String asciiToHex()
    {
        System.out.print("\nPlease enter the ascii code: ");
        String ascii = sc.nextLine();

        StringBuilder hex = new StringBuilder();

        for (char ch : ascii.toCharArray())
            hex.append(Integer.toHexString((int) ch));

        String hexResult = hex.toString();

        System.out.println(ascii + " = " + hexResult + " in hexadecimal");

        return hexResult;
    }
}
