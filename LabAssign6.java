
/**
 * This is lab 6.
 * @author Marcy Held
 * Date: 06-27-15
 */
import java.util.Random;
import javax.swing.JOptionPane;

public class LabAssign6 {

    public static void main(String[] args) {
        
        int choice, numInput;
        String tempBox;
        
        Random numGen = new Random ( );
        
        tempBox = JOptionPane.showInputDialog (null, 
                "Enter a choice:\n1 -- Create a random number" +
                        "\n2 -- Enter the number 1-500");
        choice = Integer.parseInt(tempBox);
        
        //switch control structure
        /* switch (choice) {
        case 1: generate random num
        numInput = numGen.nextInt (500) + 1;
            etc
            etc
        case 2: user input number 1-500
        input = JOptionPane.showInputDialog ("Enter a number etc etc etc")
        if
            else
        etc
        etc
        etc
        default is : JOptionPane.showMessageDialog (null, "Invalid choice");
        }
        */
        
        if (choice == 1)
        {    
            numInput = numGen.nextInt (500) + 1;
        
            if (numInput % 7 == 0)
                JOptionPane.showMessageDialog (null, 
                        "The number " + numInput + " is divisible by 7");
        
            else 
                JOptionPane.showMessageDialog (null,
                        "The number " + numInput + " is NOT divisible by 7");   
        }
        
        else if (choice == 2)
        {   
            tempBox = JOptionPane.showInputDialog (null, 
                "Enter a number between 1 - 500");
            numInput = Integer.parseInt (tempBox);
        
            if (numInput < 0 || numInput > 500)
                JOptionPane.showMessageDialog (null, "The number " +
                        numInput + " is not between 1 - 500");
        
            else       
               if (numInput % 7 == 0)
                   JOptionPane.showMessageDialog (null, "The number " +
                        numInput + " is divisible by 7");
        
                else
                   JOptionPane.showMessageDialog (null, "The number " +
                        numInput + " is NOT divisible by 7");
        }
        
        else
            JOptionPane.showMessageDialog (null, "Invalid choice");
        
        
        System.exit(0);
        
    }
    
}
