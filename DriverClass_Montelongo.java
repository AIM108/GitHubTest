
/**
 * DriverClass_Montelongo.
 *
 * @author Alonso Montelongo
 * @version 1/28/2020
 */
import java.util.Scanner;
public class DriverClass_Montelongo
{

    
    public static void main(String[]arg)
    { 
    Scanner keyboard = new Scanner(System.in);
    int intValue;
    float floatValue;
    String stringValue;
    
    
    
    //Read input from the keyboard
    System.out.println("Enter an integer number:");
    intValue =keyboard.nextInt();
    
    System.out.println("Enter a decimal number:");
    floatValue=keyboard.nextFloat();
    keyboard.nextLine();
    System.out.println("Enter a string:");
    stringValue=keyboard.nextLine();
    
    //Declare an object of class DataTypeClass_Montelongo
    DataTypeClass_Montelongo object = new DataTypeClass_Montelongo(intValue,floatValue,stringValue);
    
    //print the output
    System.out.println(object);
    
    
    
    
    
    
    
    
    
}
}
