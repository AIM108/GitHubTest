
/**
 * DataTypeClass_Montelongo.
 *
 * @author Alonso Montelongo
 * @version 1/28/2020
 */
public class DataTypeClass_Montelongo
{
    //Question1:What is the name of the following lines in the data type class?
        //They are the primitive data types.
    private int intVariable;
    private float floatVariable;
    private String stringVariable;
    
    
    //Question2:What is the name that we call the following lines in the data type class?
    // We call these lines of code a no argument constructor.
    public DataTypeClass_Montelongo()
    {
        intVariable =0;
        floatVariable = 0;
        stringVariable="aString";
    }
    
    //Question3:What is the name that we call the following lines in the data type class?
    //We call these lines of code a parameter constructor.
        public DataTypeClass_Montelongo(int intVar,float floatVar, String stringVar)
    {
        intVariable =intVar;
        floatVariable = floatVar;
        stringVariable=stringVar;
    }
    
    //Question4:What is the name that we call the following method in the data type class?
    // This is a mutator method and it changes the data that we have.
    
    
    public void setIntVariable(int intVar)
    {
        intVariable =intVar;
    }
    
    //Question5:What is the name that we call the following method in the data type class?
    //This method is called an accessor method give the user access to the data and returns it to them.
    public float getFloatVariable()
    {
        return floatVariable;
    }
    
    //Qusetion6: What is the purpose of the following method in the data type class?
    //The purpose of the method is to print out our data in a user friendly way so they can understand it.
    public String toString()
    {
        String str ="My name:Alonso Montelongo\n"+
           "The output is \n"+
           "Integer number:"+intVariable+"\n"+
           "Decimal number:"+floatVariable+"\n"+
           "String is:"+stringVariable+"\n";
           
           return str;
    }
    
    
    
    
    
    
    
}
