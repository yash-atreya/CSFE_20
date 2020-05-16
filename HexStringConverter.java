/**
 * Template for the HexStringConverter Excercise 
 * 
 * @author matthes.elstermann@kit.
 * @version 25-Apr-2018
 * 
 */
public class HexStringConverter
{    
    public static String[] hexStrings = {"2ae43", "8g023", "249abc", "2354aer23", "234245"};
    public static int invalid = 0;
    /**
     * main method
     * 
     * @param args - command line parameters
     */
    public static void main(String [] args)
    {
        //given variables
        
        
            //define the allowed characters (hex alphabet) and print them out

            String validChars = "0123456789abcdef";
			int i;
            System.out.print("Valid Hexes: ");
            for(i = 0; i < validChars.length(); i++) {
                System.out.print(validChars.charAt(i) + ",");
            }

            System.out.println("");
        for(int x = 0; x < hexStrings.length; x++) {
            char[] hexCharArray = hexStrings[x].toCharArray();
        

            //auxiluary variables
        


            //check if the string contains only valid HEX-Value-signs
        
        
            for(int j = 0; j < hexCharArray.length; j++) {
                char c = hexCharArray[j];
                if((c >= '0' && c <= '9') || (c >= 'a' && c <= 'f') || (c >= 'A' && c <= 'F')) {
                    invalid = 0;
                } else {
                    invalid = 1;
                    System.out.println("The String " + hexStrings[x] + " is no valid hex-string");
                    break;
                }
            }

            if(invalid == 0) {
                int decimal = Integer.parseInt(hexStrings[x], 16);
                System.out.println("The decimal value of the hex-String " + hexStrings[x] + "is: " + decimal);
            }
            // calculation of powers (Hochzahlen) is done with Math.pow(double a, double b) method.
            // e.g. Math.pow(16,0) --> 1 or Math.pow( 16,2) --> 256
        }
    }
}
