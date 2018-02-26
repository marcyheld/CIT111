
/**
 *
 * @author Marcy Held
 * Date: 07-06-15
 */
import java.util.Random;
import javax.swing.JOptionPane;

public class LabAssign6Loop {

    public static void main(String[] args) {
        int number, choice;
        Random create = new Random ();
        String input;
        input = JOptionPane.showInputDialog (null, "Enter a choice:" +
                "\n1 -- Create a random number" +
                "\n2 -- Enter the number 1-500");
        choice = Integer.parseInt (input);
        
        switch (choice) {
            case 1:
                number = create.nextInt (500) + 1;
                if (number % 7 == 0) 
                {
                    JOptionPane.showMessageDialog (null, "The number " +
                            number + " is divisible by 7");
                } else 
                {
                    JOptionPane.showMessageDialog (null, "The number " +
                            number + " is NOT divisible by 7");
                }
            break;
                
            case 2:
                input = JOptionPane.showInputDialog (null,
                        "Enter a number between 1 - 500");
                number = Integer.parseInt (input);
                if (number >= 1 && number <= 500) 
                {
                    if (number % 7 == 0) 
                    {
                        JOptionPane.showMessageDialog (null,
                                "The number " + number + " is divisible by 7");
                    } else 
                    {
                        JOptionPane.showMessageDialog (null,
                                "The number " + number + " is NOT divisible by 7");
                    } 
                } else 
                {
                    JOptionPane.showMessageDialog (null, "The number " + number +
                            " is not between 1 - 500");
                }
                break;
            default:
                JOptionPane.showMessageDialog (null, "Invalid choice");
        }
        
        System.exit(0);
    }
    
}
