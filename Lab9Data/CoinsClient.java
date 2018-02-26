package Lab9Data;

/* Coins Client
   This class uses the services of the Coin class
   *** Do not change the code below *** 
*/

import java.text.NumberFormat;

public class CoinsClient
{
  public static void main( String [] args )
  {
    NumberFormat dollarFormat = NumberFormat.getCurrencyInstance( );

    Coins c1 = new Coins( 4, 3, 2, 3 );
    Coins c2 = new Coins( -1, 5, 3, 4 );
    System.out.println( "The number of quarters of coins #1 is " + c1.getQuarters( ) );
    System.out.println( "The number of dimes of coins #1 is " + c1.getDimes( ) );
    System.out.println( "The number of nickels of coins #1 is " + c1.getNickels( ) );
    System.out.println( "The number of pennies of coins #1 is " + c1.getPennies( ) );
 
    System.out.println( "\nCoins #2 is " + c2.toString( ) );
    System.out.println( "From quarters: " + dollarFormat.format( c2.moneyFromQuarters( ) ) );
    System.out.println( "From dimes: " + dollarFormat.format( c2.moneyFromDimes( ) ) );
    System.out.println( "From nickels: " + dollarFormat.format( c2.moneyFromNickels( ) ) );
    System.out.println( "From pennies: " + dollarFormat.format( c2.moneyFromPennies( ) ) );
    c2.outputTotalAmount( ); 
    System.out.println( );   

    if ( c1.equals( c2 ) )
      System.out.println( "Original coins #1 and #2 are identical" );
    else
      System.out.println( "Original coins #1 and #2 are different" );
 
    c2.setQuarters( 4 );
    c2.setDimes( 3 );
    c2.setNickels( 2 );
    c2.setPennies( 3 );

    if ( c1.equals( c2 ) )
      System.out.println( "Original coins #1 and modified coins #2 are identical" );
    else
      System.out.println( "Original coins #1 and modified coins #2 are different" );

  }
}