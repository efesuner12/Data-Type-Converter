package convertion.ascii;

import java.util.*;

public class ASCIIToBin
{
    /*
     * Ascii to binary
     * + Get ascii input
     * + convert and return result
     */
    public void asciiToBin()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nPlease enter the ascii code (Type EXIT to quit): ");
        String ascii = sc.nextLine();

        if (ascii.equalsIgnoreCase("EXIT"))
            return;

        try
        {
            byte[] bytes = ascii.getBytes();
            StringBuilder binary = new StringBuilder();

            for (byte b : bytes)
            {
                int val = b;
                for (int i = 0; i < 8; i++)
                {
                    binary.append((val & 128) == 0 ? 0 : 1);
                    val <<= 1;
                }
            }

            String finBinary = binary.toString();

            System.out.println(ascii + " = " + finBinary + " in binary\n");
        }
        catch (Exception e)
        {
            System.out.println("There has been an error!\nError message: " + e + "\n");
        }
    }
}
