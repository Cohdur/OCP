import java.util.Scanner;

/**
 * A simple conversion class for oz -> lbs
 */
public class Weight_Conversion
{
    private int oz, ozSingularvalue = 0 ,lbs = 0;
    private double converted_value; // this will be oz -> lbs conversion

    //primaryly for testing purposes
    public void setOz(int oz)
    {
  
        this.oz = oz;
    }

    public void setWeight() 
    {
        Scanner userInput = new Scanner(System.in);
        oz = userInput.nextInt();
        System.out.print('\n');
        System.out.println("The amount in ounces is: " + oz + '\n');

        userInput.close();
    }

    public void conversion()
    {
        converted_value = oz / 16.0;
        lbs = oz / 16;
        ozSingularvalue = oz % 16; 

    }
    
    public void output()
    {
        System.out.println(oz + " oz is equivalent to " + get_lbs_value() + " lbs and " + get_Oz_value() + " oz\n");
        System.out.println(oz + " oz is equivalent to " + get_converted_value() + " lbs\n");
        System.out.print("Thank you for using OCP.");
    }

    /**
     * This will return the incremented sum of oz
     * @return the ozIncrement value
     */
    public int get_Oz_value()
    {
        return ozSingularvalue;
    }

    /**
     * This will return the value of oz
     * @return the oz value
     */
    public int get_Oz()
    {
        return oz;
    }

    /**
     * This will return the incremented sum of lbs
     * @return the lbs value
     */
    public int get_lbs_value()
    {
        return lbs;
    }


    /**
     * Will return the converted value from the user oz's input
     * @return the converted value
     */
    public double get_converted_value()
    {
        return converted_value;
    }

    public static void main(String[] args)
    {
        //Create a class handle
        Weight_Conversion classObj = new Weight_Conversion();

        System.out.print("Welcome to the Ounce Conversion Program!\n");

        //Asks for oz value for conversion
        System.out.print("How many ounces do you have? ");

        //user input
        classObj.setWeight();

        //This handles the conversion
        classObj.conversion();

        //the final output of the new converted value
        classObj.output();

    }
}