package convertion.ascii;

import java.util.*;

public class ASCIIToBin
{
    Scanner sc = new Scanner(System.in);

    /*
     * Ascii to binary
     * + Get ascii input
     * + convert and return result
     */
    public String asciiToBin()
    {
        System.out.print("\nPlease enter the ascii code: ");
        String ascii = sc.nextLine();

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

        System.out.print(ascii + " = " + finBinary + " in binary");

        return finBinary;
    }
}
