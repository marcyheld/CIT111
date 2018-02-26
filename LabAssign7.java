
/**
 * This is lab 7.
 * 
 * @author Marcy Held
 * Date: 07-07-15
 */
import java.util.Random;
import javax.swing.JOptionPane;

public class LabAssign7 {

    public static void main(String[] args) {
        
        int coinFlip, userWins = 0, userLosses = 0;
        char userChoice;
        String temp, repeat;
        Random flipGen = new Random ( );
         
        do 
        {    
           temp = JOptionPane.showInputDialog (null,
                   "Enter 'H' for heads,\nEnter 'T' for tails");
           userChoice = temp.charAt(0);
           
            switch (userChoice)
            {
                case 'h':
                userChoice = 0;
                break;
                   
                case 'H':
                userChoice = 0;
                break;
               
                case 't':
                userChoice = 1;
                break;
                
                case 'T':
                userChoice = 1;
                break;  
            }
            
            coinFlip = flipGen.nextInt (2);
           
            if (userChoice == coinFlip)
            {   
                JOptionPane.showMessageDialog (null,
                    "You win!");
                ++userWins;
            }
            else
            {    
                JOptionPane.showMessageDialog (null,
                    "Computer wins");
                ++userLosses;
            }
           
            repeat = JOptionPane.showInputDialog (null, 
                "Enter 'Y' to play again, 'N' to quit");
            
        } while (repeat.equalsIgnoreCase ("y"));
        
        JOptionPane.showMessageDialog (null, "The summary is " + userWins + 
                " wins and " + userLosses + " losses.");
        
        System.exit (0);
        
    }
    
}