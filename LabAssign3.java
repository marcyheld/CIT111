import java.util.Random;

/**
 * This is lab 3.
 * @author Marcy Held
 * Date: 06-06-15
 */
public class LabAssign3 {

    public static void main(String[] args) {
        
        Random rGen = new Random( );
        
        int num1, num2;
        
        num1 = rGen.nextInt (25) + 1;
        num2 = rGen.nextInt (25) + 1;
        
        int smallest = Math.min ( num1 , num2 );
        
        System.out.println("The two random numbers are " + 
                num1 + " and " + num2);
        System.out.println( "The smallest number is " + smallest );
        
        
    }
    
}
