import java.util.Random;

/**
 * This is lab 3.
 * @author Marcy Held
 * Date: 06-06-15
 */
public class LabAssign3B {

    public static void main(String[] args) {
        
        Random rGen = new Random( );
        
        int num1, num2;
        
        num1 = rGen.nextInt (25) + 1;
        num2 = rGen.nextInt (25) + 1;
        
        if (num1 == num2)
        {
            num2 = rGen.nextInt (25) + 1;
        }
        // does not completely ensure that the same number will be assigned
        // to num1 and num2, but significantly lessens chances.
        // in order to more completely ensure, would have to change the above
        // decision to a LOOP (ch. 6). [would need to replace "if" with a loop]
        // loop = replace "if" with "while"
        
        int smallest = Math.min ( num1 , num2 );
        
        System.out.println("The two random numbers are " + 
                num1 + " and " + num2);
        System.out.println( "The smallest number is " + smallest );
        
        
    }
    
}
