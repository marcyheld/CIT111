
/**
 * This is lab 8.
 * @author Marcy Held
 * Date: 07-14-15
 */
import java.util.Random;
import javax.swing.JOptionPane;

public class LabAssign8 {
    
    public static char getValidGuess () 
    {   String guessInput;
        char userGuess;
        
        do {
        guessInput = JOptionPane.showInputDialog (null, 
                    "Enter 'H' for heads,\nEnter 'T' for tails");
            userGuess = guessInput.charAt(0);
            userGuess = Character.toUpperCase (userGuess);
            } while (userGuess != 'H' && userGuess != 'T');
                
            return userGuess;
    }
    
    public static char getCoinToss () 
    {   int rNum;
        char coinToss;
        
        Random flipGen = new Random ( );
        rNum = flipGen.nextInt(2);
            
            if (rNum == 0) 
            {
                coinToss = 'H';
            }
            else 
            {
                coinToss = 'T';
            }
        
            return coinToss;
    }

    public static void main(String[] args) {
        int userWins = 0, userLosses = 0;
        char userChoice, coinFlip;
        String repeat;
        
        do { 
            userChoice = getValidGuess();
            
            coinFlip = getCoinToss();
                    
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
