
/**
 * This is lab 5.
 * @author Marcy Held
 * Date: 6-21-15
 */
import java.util.Random;
import javax.swing.JOptionPane;

public class LabAssign5 {
 
    public static void main(String[] args) {
        
        int generatedNumber, remainder;
        
        Random rGen = new Random ( );
        generatedNumber = rGen.nextInt (500) + 1;
        
        remainder = generatedNumber % 7;
        
        if ( remainder > 0 )
            JOptionPane.showMessageDialog( null, "The number " + 
                    generatedNumber + " is NOT divisible by 7" );
        
        else
            JOptionPane.showMessageDialog ( null, "The number " + 
                    generatedNumber + " is divisible by 7" );
        
        /* OR if (generatedNumber % 7 == 0)
                JOptionPane.showMessageDialog ( null, "The number " +
                        generatedNumber + " is divisible by 7");
              else
                JOptionPane.showMessageDialog ( null, "The number " +
                        generatedNumber + " is NOT divisible by 7");
        */
        
        
    System.exit(0);
    
    }
    
}
