package print;

public class Print
{
    /*
    * Welcome text printed at the beginning of the program
    */
    public void printWelcome()
    {
        System.out.println("##################################################");
        System.out.println("           --- Data Type Converter ---");
        System.out.println(" --- Version: 1.0 (2021) - Author: hackerman ---");
        System.out.println("##################################################");
    }

    /*
    * Options printed for user to choose of conversation type
    */
    public void printChoose()
    {
        System.out.println("\nPlease choose the conversation type you wish to perform:");
        System.out.println("1- ASCII to Binary");
        System.out.println("2- ASCII to Decimal");
        System.out.println("3- ASCII to Hexadecimal");
        System.out.println("4- Binary to ASCII");
        System.out.println("5- Binary to Decimal");
        System.out.println("6- Binary to Hexadecimal");
        System.out.println("7- Decimal to ASCII");
        System.out.println("8- Decimal to Binary");
        System.out.println("9- Decimal to Hexadecimal");
        System.out.println("10- Hexadecimal to ASCII");
        System.out.println("11- Hexadecimal to Binary");
        System.out.println("12- Hexadecimal to Decimal\n");

        System.out.println("99- Exit");
    }
}
