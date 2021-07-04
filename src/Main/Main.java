package Main;

import operation.Operation;
import print.Print;

/*
* Main method of the program
* + create a Print var
* + call printWelcome() and printChoose()
* + Create an Operation object
* + call operationSelector()
*/
public class Main
{
    public static void main(String[] args)
    {
        Print printVar = new Print();

        printVar.printWelcome();
        printVar.printChoose();

        Operation operationObject = new Operation();
        operationObject.operationSelector();
    }
}
