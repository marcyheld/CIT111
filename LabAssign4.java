
/**
 * This is lab 4.
 * @author Marcy Held
 * Date: 06-11-15
 */

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class LabAssign4 {

    public static void main(String[] args) {
        
        DecimalFormat answerFormat = new DecimalFormat ("#.000");
        
        String input = JOptionPane.showInputDialog (null,
                "Enter the number of inches to be coverted to millimeters:");
        //THIS WAS SUPPOSED TO BE ON TWO LINES!!!! ^
        //"Enter the number of inches to be converted \nto millimeters:"
        
        double inches = Double.parseDouble (input);
        double millimeters;
        final double CONVERSION_RATE = 25.4;
        
        millimeters = inches * CONVERSION_RATE;
        
        JOptionPane.showMessageDialog (null, inches + " inches converts to " +
                answerFormat.format (millimeters) + " millimeters.");
        
        System.exit(0);
        
    }
    
}
